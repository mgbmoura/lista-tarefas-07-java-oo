// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio04_polimorfismo;

// # DEFINE UM "CONTRATO" (INTERFACE) QUE TODO MEIO DE TRANSPORTE DEVE SEGUIR
// # UMA INTERFACE SÓ DEFINE O QUE FAZER, MAS NÃO COMO FAZER.
public interface IMeioTransporte {
    // # MÉTODOS QUE TODA CLASSE QUE IMPLEMENTAR ESTA INTERFACE É OBRIGADA A TER
    void acelerar();
    void frear();
}