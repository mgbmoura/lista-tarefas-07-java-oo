// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio06_imutabilidade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// # A CLASSE PRINCIPAL DO CARRINHO, TAMBÉM IMUTÁVEL
public final class Carrinho {
    private final List<ItemCarrinho> itens;

    // # CONSTRUTOR PARA UM CARRINHO NOVO E VAZIO
    public Carrinho() {
        this.itens = Collections.emptyList();
    }
    
    // # CONSTRUTOR PRIVADO USADO PELOS MÉTODOS DE "MODIFICAÇÃO"
    private Carrinho(List<ItemCarrinho> itens) {
        // # GARANTE QUE A LISTA INTERNA NÃO POSSA SER MODIFICADA DE FORA
        this.itens = Collections.unmodifiableList(itens);
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    // # OPERAÇÃO DE ADICIONAR ITEM
    public Carrinho adicionarItem(ProdutoImutavel produto, int quantidade) {
        // # 1. CRIA UMA NOVA LISTA MODIFICÁVEL, COPIANDO OS ITENS ANTIGOS
        List<ItemCarrinho> novosItens = new ArrayList<>(this.itens);
        // # 2. ADICIONA O NOVO ITEM À NOVA LISTA
        novosItens.add(new ItemCarrinho(produto, quantidade));
        // # 3. RETORNA UMA NOVA INSTÂNCIA DO CARRINHO COM A NOVA LISTA
        return new Carrinho(novosItens);
    }

    // # OPERAÇÃO DE REMOVER ITEM
    public Carrinho removerItem(ProdutoImutavel produto) {
        List<ItemCarrinho> novosItens = new ArrayList<>(this.itens);
        novosItens.removeIf(item -> item.getProduto().equals(produto));
        // # TAMBÉM RETORNA UM NOVO CARRINHO
        return new Carrinho(novosItens);
    }
}