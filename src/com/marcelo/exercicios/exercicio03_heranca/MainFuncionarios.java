// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio03_heranca;

// # IMPORTA AS FERRAMENTAS NECESSÁRIAS
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// # CLASSE PRINCIPAL PARA EXECUTAR E TESTAR NOSSO CÓDIGO
public class MainFuncionarios {
    public static void main(String[] args) {
        // # CRIA INSTÂNCIAS DE CADA TIPO DE FUNCIONÁRIO
        Gerente gerente = new Gerente("Marcelo", new BigDecimal("10000.00"));
        Desenvolvedor dev = new Desenvolvedor("Giulian", new BigDecimal("8000.00"));

        // # COLOCA DIFERENTES FUNCIONÁRIOS EM UMA COLEÇÃO DO TIPO LISTA
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gerente);
        funcionarios.add(dev);

        System.out.println("--- Exercício 3: Herança ---");
        
        // # PERCORRE A LISTA E EXIBE O BÔNUS DE CADA UM
        for (Funcionario f : funcionarios) {
            // # O JAVA CHAMA O MÉTODO 'calcularBonus()' CORRETO PARA CADA OBJETO (POLIMORFISMO)
            BigDecimal bonus = f.calcularBonus();
            System.out.println("Funcionário: " + f.getNome() + ", Bônus: R$ " + bonus);
        }
    }
}