// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio07_generics;

// # CRIA NOSSA PRÓPRIA CLASSE DE ERRO PARA QUANDO UMA ENTIDADE NÃO FOR ENCONTRADA
public class EntidadeNaoEncontradaException extends Exception {
    public EntidadeNaoEncontradaException(String message) {
        super(message);
    }
}