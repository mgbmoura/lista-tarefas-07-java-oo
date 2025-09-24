package com.marcelo.exercicios.exercicio01_produto;
import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, BigDecimal preco, int quantidadeEmEstoque) {
        setNome(nome);
        setPreco(preco);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    public String getNome() { return nome; }
    public BigDecimal getPreco() { return preco; }
    public int getQuantidadeEmEstoque() { return quantidadeEmEstoque; }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public void setPreco(BigDecimal preco) {
        if (preco == null || preco.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        }
        this.quantidadeEmEstoque = quantidade;
    }
}
