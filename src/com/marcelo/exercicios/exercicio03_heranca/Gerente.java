// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio03_heranca;

// # IMPORTA A FERRAMENTA DE DINHEIRO
import java.math.BigDecimal;

// # GERENTE "HERDA" TUDO QUE FUNCIONARIO TEM, USANDO A PALAVRA 'extends'
public class Gerente extends Funcionario {

    // # CONSTRUTOR QUE CHAMA O CONSTRUTOR DA CLASSE PAI (Funcionario)
    public Gerente(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    // # SOBRESCREVE O MÉTODO PARA O BÔNUS ESPECÍFICO DO GERENTE
    @Override
    public BigDecimal calcularBonus() {
        // # BÔNUS DE 20% DO SALÁRIO, COMO DEFINIDO NO ENUNCIADO
        return this.salario.multiply(new BigDecimal("0.20"));
    }
}