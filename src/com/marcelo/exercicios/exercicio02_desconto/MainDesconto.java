package com.marcelo.exercicios.exercicio02_desconto;
import java.math.BigDecimal;

public class MainDesconto {
    public static void main(String[] args) {
        System.out.println("--- Exercício 2: Demonstração ---");
        ProdutoComDesconto p2 = new ProdutoComDesconto("Smartphone", new BigDecimal("2000.00"));

        System.out.println("\n# APLICANDO DESCONTO VÁLIDO");
        System.out.println("Preço antes: " + p2.getPreco());
        p2.aplicarDesconto(20); // 20%
        System.out.println("Preço depois (20%): " + p2.getPreco());

        System.out.println("\n# TENTANDO APLICAR DESCONTO INVÁLIDO (70%)");
        try {
            p2.aplicarDesconto(70);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO CAPTURADO: " + e.getMessage());
        }
    }
}
