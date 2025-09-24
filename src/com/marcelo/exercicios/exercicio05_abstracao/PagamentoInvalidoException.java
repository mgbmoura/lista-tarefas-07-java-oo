// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio05_abstracao;

// # CRIA NOSSA PRÓPRIA CLASSE DE ERRO, HERDANDO DE 'Exception'
public class PagamentoInvalidoException extends Exception {
    public PagamentoInvalidoException(String message) {
        super(message);
    }
}