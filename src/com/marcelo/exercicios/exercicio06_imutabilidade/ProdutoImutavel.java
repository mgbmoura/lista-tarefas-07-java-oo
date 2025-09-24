// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio06_imutabilidade;

// # UMA CLASSE SIMPLES E IMUTÁVEL PARA REPRESENTAR UM PRODUTO
public final class ProdutoImutavel {
    private final String nome;
    private final Dinheiro preco;

    public ProdutoImutavel(String nome, Dinheiro preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public Dinheiro getPreco() { return preco; }
}