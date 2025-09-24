// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio05_abstracao;

public class Boleto extends FormaPagamento {
    private String codigoDeBarras;

    public Boleto(String codigoDeBarras) { 
        this.codigoDeBarras = codigoDeBarras; 
    }
    
    // # IMPLEMENTA O MÉTODO ABSTRATO 'validarPagamento' COM A REGRA DO BOLETO
    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        System.out.println("Validando código de barras do boleto...");
        // # VALIDAÇÃO SIMPLES: VERIFICA SE O CÓDIGO TEM 48 DÍGITOS
        if (codigoDeBarras == null || !codigoDeBarras.matches("\\d{48}")) {
            throw new PagamentoInvalidoException("Código de barras do boleto inválido!");
        }
    }
}