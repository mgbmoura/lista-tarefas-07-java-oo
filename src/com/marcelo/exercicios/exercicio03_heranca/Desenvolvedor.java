// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio03_heranca;

// # IMPORTA A FERRAMENTA DE DINHEIRO
import java.math.BigDecimal;

// # DESENVOLVEDOR TAMBÉM "HERDA" DE FUNCIONARIO
public class Desenvolvedor extends Funcionario {

    // # CONSTRUTOR QUE CHAMA O CONSTRUTOR DA CLASSE PAI
    public Desenvolvedor(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    // # SOBRESCREVE O MÉTODO PARA O BÔNUS ESPECÍFICO DO DESENVOLVEDOR
    @Override
    public BigDecimal calcularBonus() {
        // # BÔNUS DE 10% DO SALÁRIO, COMO DEFINIDO NO ENUNCIADO
        return this.salario.multiply(new BigDecimal("0.10"));
    }
}