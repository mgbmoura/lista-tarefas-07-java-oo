// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio04_polimorfismo;

// # CARRO "ASSINA O CONTRATO" DE SER UM MEIO DE TRANSPORTE, USANDO A PALAVRA 'implements'
public class Carro implements IMeioTransporte {
    // # ATRIBUTO PRIVADO PARA GUARDAR A VELOCIDADE ATUAL DO CARRO
    private int velocidade = 0;

    // # IMPLEMENTA O MÉTODO 'acelerar' EXIGIDO PELO CONTRATO, COM SUA PRÓPRIA LÓGICA
    @Override
    public void acelerar() {
        velocidade += 10;
        System.out.println("Carro acelerando para " + velocidade + " km/h.");
    }

    // # IMPLEMENTA O MÉTODO 'frear' EXIGIDO PELO CONTRATO, COM SUA PRÓPRIA LÓGICA
    @Override
    public void frear() {
        if (velocidade > 0) {
            // # USA Math.max PARA GARANTIR QUE A VELOCIDADE NUNCA FIQUE NEGATIVA
            velocidade = Math.max(0, velocidade - 10);
            System.out.println("Carro freando para " + velocidade + " km/h.");
        } else {
            System.out.println("Carro já está parado!");
        }
    }
}