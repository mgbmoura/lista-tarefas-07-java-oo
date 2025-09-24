// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio05_abstracao;

public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) { 
        this.chavePix = chavePix; 
    }
    
    // # IMPLEMENTA O MÉTODO ABSTRATO 'validarPagamento' COM A REGRA DO PIX
    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        System.out.println("Validando chave Pix...");
        // # VALIDAÇÃO SIMPLES: VERIFICA SE A CHAVE NÃO ESTÁ VAZIA
        if (chavePix == null || chavePix.trim().isEmpty()) {
            throw new PagamentoInvalidoException("Chave Pix inválida!");
        }
    }
}