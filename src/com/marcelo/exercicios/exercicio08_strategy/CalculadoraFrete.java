// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio08_strategy;

import java.math.BigDecimal;

// # ESTA CLASSE É O "CONTEXTO", ELA USA UMA ESTRATÉGIA PARA FAZER SEU TRABALHO
public class CalculadoraFrete {
    // # GUARDA A ESTRATÉGIA ATUAL
    private FreteStrategy estrategia;

    // # PERMITE TROCAR A ESTRATÉGIA A QUALQUER MOMENTO
    public void setEstrategia(FreteStrategy estrategia) {
        this.estrategia = estrategia;
    }
    
    // # EXECUTA O CÁLCULO USANDO A ESTRATÉGIA QUE FOI DEFINIDA
    public BigDecimal calcularFrete(Pedido pedido) {
        if (estrategia == null) {
            throw new IllegalStateException("Nenhuma estratégia de frete foi definida.");
        }
        return estrategia.calcular(pedido);
    }
}