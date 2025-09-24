// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio04_polimorfismo;

// # BICICLETA TAMBÉM "ASSINA O CONTRATO" DE SER UM MEIO DE TRANSPORTE
public class Bicicleta implements IMeioTransporte {
    private int velocidade = 0;

    // # IMPLEMENTA O MÉTODO 'acelerar' COM A LÓGICA DA BICICLETA
    @Override
    public void acelerar() {
        velocidade += 2;
        System.out.println("Bicicleta acelerando para " + velocidade + " km/h.");
    }

    // # IMPLEMENTA O MÉTODO 'frear' COM A LÓGICA DA BICICLETA
    @Override
    public void frear() {
        if (velocidade > 0) {
            velocidade = Math.max(0, velocidade - 2);
            System.out.println("Bicicleta freando para " + velocidade + " km/h.");
        } else {
            System.out.println("Bicicleta já está parada!");
        }
    }
}