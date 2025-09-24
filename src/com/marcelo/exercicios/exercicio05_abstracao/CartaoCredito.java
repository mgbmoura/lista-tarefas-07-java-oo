// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio05_abstracao;

// # HERDA DA CLASSE ABSTRATA 'FormaPagamento'
public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) { 
        this.numeroCartao = numeroCartao; 
    }
    
    // # IMPLEMENTA O MÉTODO ABSTRATO 'validarPagamento' COM A REGRA DO CARTÃO
    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        System.out.println("Validando número do cartão...");
        // # VALIDAÇÃO SIMPLES: VERIFICA SE O NÚMERO TEM 16 DÍGITOS
        if (numeroCartao == null || !numeroCartao.matches("\\d{16}")) {
            throw new PagamentoInvalidoException("Número de cartão de crédito inválido!");
        }
    }
}