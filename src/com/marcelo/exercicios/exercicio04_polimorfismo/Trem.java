// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio04_polimorfismo;

// # TREM TAMBÉM "ASSINA O CONTRATO" DE SER UM MEIO DE TRANSPORTE
public class Trem implements IMeioTransporte {
    private int velocidade = 0;

    // # IMPLEMENTA O MÉTODO 'acelerar' COM A LÓGICA DO TREM
    @Override
    public void acelerar() {
        velocidade += 50;
        System.out.println("Trem acelerando para " + velocidade + " km/h.");
    }

    // # IMPLEMENTA O MÉTODO 'frear' COM A LÓGICA DO TREM
    @Override
    public void frear() {
        if (velocidade > 0) {
            velocidade = Math.max(0, velocidade - 50);
            System.out.println("Trem freando para " + velocidade + " km/h.");
        } else {
            System.out.println("Trem já está parado!");
        }
    }
}