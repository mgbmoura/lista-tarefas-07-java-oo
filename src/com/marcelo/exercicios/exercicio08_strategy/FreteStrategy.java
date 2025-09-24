// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio08_strategy;

// # IMPORTA A FERRAMENTA DE DINHEIRO
import java.math.BigDecimal;

// # DEFINE A INTERFACE PARA A "ESTRATÉGIA" DE CÁLCULO DE FRETE
// # '@FunctionalInterface' INDICA QUE É UMA INTERFACE COM UM ÚNICO MÉTODO, IDEAL PARA USAR COM LAMBDAS
@FunctionalInterface
public interface FreteStrategy {
    // # TODA ESTRATÉGIA DE FRETE DEVE TER UM MÉTODO 'calcular'
    BigDecimal calcular(Pedido pedido);
}