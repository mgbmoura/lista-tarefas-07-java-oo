// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio08_strategy;

import java.math.BigDecimal;

// # CLASSE SIMPLES QUE REPRESENTA O PEDIDO SOBRE O QUAL O FRETE SERÁ CALCULADO
public class Pedido {
    private BigDecimal valorTotal;

    public Pedido(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
}