// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio05_abstracao;

// # IMPORTA A FERRAMENTA DE DINHEIRO
import java.math.BigDecimal;

// # CLASSE PRINCIPAL PARA EXECUTAR E TESTAR NOSSO CÓDIGO
public class MainPagamentos {
    public static void main(String[] args) {
        System.out.println("--- Exercício 5: Abstração ---");
        
        // # CRIA INSTÂNCIAS DE DIFERENTES FORMAS DE PAGAMENTO
        FormaPagamento cartaoValido = new CartaoCredito("1111222233334444");
        FormaPagamento cartaoInvalido = new CartaoCredito("123");
        FormaPagamento boletoValido = new Boleto("123456789012345678901234567890123456789012345678");
        
        System.out.println("\n# Testando cartão válido...");
        try {
            // # CHAMA O MÉTODO DA CLASSE PAI, QUE POR SUA VEZ CHAMA O MÉTODO DA CLASSE FILHA
            cartaoValido.processarPagamento(new BigDecimal("150.00"));
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        
        System.out.println("\n# Testando cartão inválido...");
        try {
            cartaoInvalido.processarPagamento(new BigDecimal("250.00"));
        } catch (Exception e) {
            // # CAPTURA O ERRO LANÇADO PELA VALIDAÇÃO
            System.out.println("ERRO CAPTURADO: " + e.getMessage());
        }
        
        System.out.println("\n# Testando boleto válido...");
        try {
            boletoValido.processarPagamento(new BigDecimal("500.00"));
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}