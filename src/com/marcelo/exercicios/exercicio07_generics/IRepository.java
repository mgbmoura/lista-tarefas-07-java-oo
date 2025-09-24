// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio07_generics;

// # IMPORTA FERRAMENTAS NECESSÁRIAS
import java.util.List;
import java.util.Optional;

// # DEFINE O CONTRATO DO NOSSO REPOSITÓRIO GENÉRICO
// # <T extends Identificavel<ID>, ID>: ISSO SIGNIFICA QUE:
// # T -> É UM TIPO QUALQUER (GENÉRICO), DESDE QUE ELE "ASSINE O CONTRATO" DE SER IDENTIFICÁVEL
// # ID -> É O TIPO DO IDENTIFICADOR (PODE SER Integer, String, etc.)
public interface IRepository<T extends Identificavel<ID>, ID> {
    // # MÉTODOS QUE TODA IMPLEMENTAÇÃO DE REPOSITÓRIO DEVE TER
    void salvar(T entidade);
    Optional<T> buscarPorId(ID id); // # USA 'Optional' PARA EVITAR RETORNOS NULOS
    List<T> listarTodos();
    void remover(ID id) throws EntidadeNaoEncontradaException;
}