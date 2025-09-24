// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio07_generics;

// # DEFINE UM "CONTRATO" (INTERFACE) QUE GARANTE QUE QUALQUER CLASSE QUE A IMPLEMENTAR
// # TERÁ UM MÉTODO PARA OBTER SEU IDENTIFICADOR (ID)
public interface Identificavel<ID> {
    ID getId();
}