// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio06_imutabilidade;

// # REPRESENTA UM ITEM DENTRO DO CARRINHO, TAMBÉM IMUTÁVEL
public final class ItemCarrinho {
    private final ProdutoImutavel produto;
    private final int quantidade;

    public ItemCarrinho(ProdutoImutavel produto, int quantidade) {
        // # VALIDA A QUANTIDADE, COMO PEDIDO NO ENUNCIADO
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public ProdutoImutavel getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
}