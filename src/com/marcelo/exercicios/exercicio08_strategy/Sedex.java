// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio08_strategy;

import java.math.BigDecimal;

// # IMPLEMENTA A ESTRATÉGIA DE FRETE PARA SEDEX
public class Sedex implements FreteStrategy {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        System.out.println("Calculando frete com a estratégia Sedex...");
        // # LÓGICA DE CÁLCULO SIMPLES: 10% DO VALOR DO PEDIDO
        return pedido.getValorTotal().multiply(new BigDecimal("0.10"));
    }
}