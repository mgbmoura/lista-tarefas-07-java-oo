// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio08_strategy;

import java.math.BigDecimal;

// # IMPLEMENTA A ESTRATÉGIA DE FRETE PARA RETIRADA NA LOJA
public class RetiradaNaLoja implements FreteStrategy {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        System.out.println("Calculando frete com a estratégia Retirada na Loja...");
        // # FRETE GRÁTIS PARA RETIRADA
        return BigDecimal.ZERO;
    }
}