// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio08_strategy;

import java.math.BigDecimal;

// # CLASSE PRINCIPAL PARA EXECUTAR E TESTAR NOSSO CÓDIGO
public class MainFrete {
    public static void main(String[] args) {
        System.out.println("--- Exercício 8: Padrão Strategy ---");
        
        // # CRIA UM PEDIDO E A CALCULADORA
        Pedido pedido = new Pedido(new BigDecimal("250.00"));
        CalculadoraFrete calculadora = new CalculadoraFrete();

        // # CALCULA O FRETE COM A ESTRATÉGIA SEDEX
        System.out.println("\n# Testando com Sedex...");
        calculadora.setEstrategia(new Sedex());
        System.out.println("Valor do Frete: R$ " + calculadora.calcularFrete(pedido));
        
        // # TROCA A ESTRATÉGIA EM TEMPO DE EXECUÇÃO PARA PAC
        System.out.println("\n# Trocando para PAC...");
        calculadora.setEstrategia(new Pac());
        System.out.println("Valor do Frete: R$ " + calculadora.calcularFrete(pedido));

        // # CRIA UMA NOVA ESTRATÉGIA PROMOCIONAL USANDO UMA EXPRESSÃO LAMBDA
        // # REGRA: FRETE GRÁTIS PARA PEDIDOS ACIMA DE R$ 200
        System.out.println("\n# Trocando para estratégia promocional (Lambda)...");
        FreteStrategy freteGratisPromocional = p -> {
            if (p.getValorTotal().compareTo(new BigDecimal("200.00")) > 0) {
                System.out.println("Promoção aplicada: Frete Grátis!");
                return BigDecimal.ZERO;
            }
            // # SE NÃO ATINGIR O VALOR, USA O PAC COMO PADRÃO
            return new Pac().calcular(p);
        };
        
        // # DEFINE E CALCULA COM A NOVA ESTRATÉGIA LAMBDA
        calculadora.setEstrategia(freteGratisPromocional);
        System.out.println("Valor do Frete: R$ " + calculadora.calcularFrete(pedido));
    }
}