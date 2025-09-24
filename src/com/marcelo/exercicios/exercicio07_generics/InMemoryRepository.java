// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio07_generics;

// # IMPORTA AS FERRAMENTAS NECESSÁRIAS
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

// # IMPLEMENTA O REPOSITÓRIO GENÉRICO, USANDO UM MAP EM MEMÓRIA COMO "BANCO DE DADOS"
public class InMemoryRepository<T extends Identificavel<ID>, ID> implements IRepository<T, ID> {
    // # O MAPA VAI GUARDAR OS DADOS. A CHAVE É O ID, O VALOR É A ENTIDADE.
    private final Map<ID, T> bancoDeDados = new HashMap<>();

    // # IMPLEMENTA O MÉTODO 'salvar' DO CONTRATO
    @Override
    public void salvar(T entidade) {
        bancoDeDados.put(entidade.getId(), entidade);
    }

    // # IMPLEMENTA O MÉTODO 'buscarPorId' DO CONTRATO
    @Override
    public Optional<T> buscarPorId(ID id) {
        // # Optional.ofNullable CRIA UM 'Optional' VAZIO SE O RESULTADO FOR NULO
        return Optional.ofNullable(bancoDeDados.get(id));
    }

    // # IMPLEMENTA O MÉTODO 'listarTodos' DO CONTRATO
    @Override
    public List<T> listarTodos() {
        // # RETORNA UMA CÓPIA DA LISTA QUE NÃO PODE SER MODIFICADA, COMO PEDIDO NO ENUNCIADO
        return Collections.unmodifiableList(new ArrayList<>(bancoDeDados.values()));
    }

    // # IMPLEMENTA O MÉTODO 'remover' DO CONTRATO
    @Override
    public void remover(ID id) throws EntidadeNaoEncontradaException {
        // # TENTA REMOVER O ITEM E VERIFICA SE ELE EXISTIA
        if (bancoDeDados.remove(id) == null) {
            // # LANÇA A EXCEÇÃO CUSTOMIZADA SE O ID NÃO FOR ENCONTRADO
            throw new EntidadeNaoEncontradaException("Entidade com ID " + id + " não encontrada para remoção.");
        }
    }
}