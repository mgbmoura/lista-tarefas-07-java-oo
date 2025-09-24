// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio07_generics;

// # CLASSES SIMPLES DE EXEMPLO (PRODUTO E FUNCIONARIO) PARA USAR COM O REPOSITÓRIO
// # ELAS PRECISAM IMPLEMENTAR A INTERFACE 'Identificavel'

class Produto implements Identificavel<Integer> {
    private final Integer id;
    private final String nome;

    public Produto(Integer id, String nome) { this.id = id; this.nome = nome; }
    
    @Override
    public Integer getId() { return id; }

    @Override
    public String toString() { return "Produto{id=" + id + ", nome='" + nome + "'}"; }
}

class Funcionario implements Identificavel<String> {
    private final String id;
    private final String nome;
    
    public Funcionario(String id, String nome) { this.id = id; this.nome = nome; }

    @Override
    public String getId() { return id; }
    
    @Override
    public String toString() { return "Funcionario{id='" + id + "', nome='" + nome + "'}"; }
}


// # CLASSE PRINCIPAL PARA EXECUTAR E TESTAR NOSSO CÓDIGO
public class MainRepositorio {
    public static void main(String[] args) {
        System.out.println("--- Exercício 7: Generics ---");
        
        // # CRIA UM REPOSITÓRIO PARA GUARDAR OBJETOS DO TIPO 'Produto' COM ID 'Integer'
        IRepository<Produto, Integer> repositorioDeProdutos = new InMemoryRepository<>();
        
        System.out.println("\n# SALVANDO PRODUTOS...");
        repositorioDeProdutos.salvar(new Produto(1, "Notebook"));
        repositorioDeProdutos.salvar(new Produto(2, "Mouse Gamer"));
        
        // # LISTA TODOS OS PRODUTOS
        System.out.println("Produtos salvos: " + repositorioDeProdutos.listarTodos());
        
        // # BUSCA UM PRODUTO POR ID
        System.out.println("Buscando produto com ID 1: " + repositorioDeProdutos.buscarPorId(1).orElse(null));
        
        
        // # CRIA OUTRO REPOSITÓRIO, REUTILIZANDO A MESMA CLASSE 'InMemoryRepository', MAS PARA 'Funcionario'
        IRepository<Funcionario, String> repositorioDeFuncionarios = new InMemoryRepository<>();
        
        System.out.println("\n# SALVANDO FUNCIONÁRIOS...");
        repositorioDeFuncionarios.salvar(new Funcionario("F001", "Marcelo"));
        
        System.out.println("Funcionários salvos: " + repositorioDeFuncionarios.listarTodos());
        
        
        // # DEMONSTRA A EXCEÇÃO DE REMOÇÃO
        System.out.println("\n# TENTANDO REMOVER UM PRODUTO INEXISTENTE (ID 99)...");
        try {
            repositorioDeProdutos.remover(99);
        } catch (EntidadeNaoEncontradaException e) {
            System.out.println("ERRO CAPTURADO: " + e.getMessage());
        }
    }
}