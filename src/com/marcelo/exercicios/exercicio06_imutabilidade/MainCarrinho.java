// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio06_imutabilidade;
import java.math.BigDecimal;

public class MainCarrinho {
    public static void main(String[] args) {
        System.out.println("--- Exercício 6: Imutabilidade ---");

        // # CRIA ALGUNS PRODUTOS
        ProdutoImutavel prod1 = new ProdutoImutavel("Livro de Java", new Dinheiro(new BigDecimal("99.90"), Moeda.BRL));
        ProdutoImutavel prod2 = new ProdutoImutavel("Caneta Azul", new Dinheiro(new BigDecimal("5.00"), Moeda.BRL));

        // # DEMONSTRA O FLUXO IMUTÁVEL
        
        // # 1. CRIA O CARRINHO INICIAL, VAZIO
        Carrinho carrinho1 = new Carrinho();
        System.out.println("Itens no carrinho 1: " + carrinho1.getItens().size());
        
        // # 2. ADICIONA UM LIVRO. ISSO CRIA UM NOVO OBJETO 'carrinho2'
        Carrinho carrinho2 = carrinho1.adicionarItem(prod1, 1);
        
        // # 3. ADICIONA UMA CANETA. ISSO CRIA UM NOVO OBJETO 'carrinho3'
        Carrinho carrinho3 = carrinho2.adicionarItem(prod2, 2);
        
        // # VERIFICA QUE OS CARRINHOS ANTERIORES NÃO FORAM ALTERADOS
        System.out.println("Itens no carrinho 1 (original) ainda tem " + carrinho1.getItens().size() + " itens."); // Deve ser 0
        System.out.println("Itens no carrinho 2 (com livro) ainda tem " + carrinho2.getItens().size() + " itens."); // Deve ser 1
        System.out.println("Itens no carrinho 3 (com tudo) tem " + carrinho3.getItens().size() + " itens."); // Deve ser 2
    }
}