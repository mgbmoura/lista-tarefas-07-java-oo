package com.marcelo.exercicios.exercicio01_produto;
import java.math.BigDecimal;

public class MainProduto {
    public static void main(String[] args) {
        System.out.println("--- Exercício 1: Demonstração ---");
        
        System.out.println("\n# CRIANDO PRODUTO VÁLIDO");
        Produto p1 = new Produto("Notebook", new BigDecimal("3500.00"), 10);
        System.out.println("Produto: " + p1.getNome() + ", Preço: " + p1.getPreco());

        System.out.println("\n# TENTANDO ATRIBUIR VALOR INVÁLIDO (PREÇO NEGATIVO)");
        try {
            p1.setPreco(new BigDecimal("-100"));
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO CAPTURADO: " + e.getMessage());
        }
    }
}
