// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio03_heranca;

// # IMPORTA A FERRAMENTA DO JAVA PARA LIDAR COM DINHEIRO DE FORMA PRECISA
import java.math.BigDecimal;

// # DEFINE A CLASSE BASE (PAI) PARA TODOS OS FUNCIONÁRIOS
public class Funcionario {
    // # ATRIBUTOS PROTEGIDOS: ACESSÍVEIS APENAS PELA PRÓPRIA CLASSE E SUAS FILHAS
    protected String nome;
    protected BigDecimal salario;

    // # CONSTRUTOR: MÉTODO CHAMADO QUANDO UM NOVO FUNCIONÁRIO É CRIADO
    public Funcionario(String nome, BigDecimal salario) {
        // # GARANTE QUE SALÁRIOS SEJAM POSITIVOS
        if (salario == null || salario.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O salário deve ser um valor positivo.");
        }
        this.nome = nome;
        this.salario = salario;
    }

    // # GETTERS PARA ACESSO EXTERNO, COMO PEDIDO NO ENUNCIADO
    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    // # MÉTODO PADRÃO PARA CALCULAR BÔNUS (SERÁ SOBRESCRITO PELAS CLASSES FILHAS)
    public BigDecimal calcularBonus() {
        // # POR PADRÃO, UM FUNCIONÁRIO COMUM NÃO TEM BÔNUS
        return BigDecimal.ZERO;
    }
}