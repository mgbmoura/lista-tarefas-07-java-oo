package com.marcelo.exercicios.exercicio02_desconto;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProdutoComDesconto {
    private String nome;
    private BigDecimal preco;
    
    public ProdutoComDesconto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public BigDecimal getPreco() { return preco; }
    
    // # MÉTODO PARA APLICAR DESCONTO
    public void aplicarDesconto(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("Desconto deve ser entre 0 e 50%.");
        }
        BigDecimal fatorDesconto = BigDecimal.ONE.subtract(BigDecimal.valueOf(porcentagem / 100.0));
        this.preco = this.preco.multiply(fatorDesconto).setScale(2, RoundingMode.HALF_UP);
    }
}
