// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio04_polimorfismo;

// # IMPORTA AS FERRAMENTAS PARA CRIAR LISTAS
import java.util.ArrayList;
import java.util.List;

// # CLASSE PRINCIPAL PARA EXECUTAR E TESTAR NOSSO CÓDIGO
public class MainTransporte {
    public static void main(String[] args) {
        System.out.println("--- Exercício 4: Polimorfismo com Interface ---");
        
        // # CRIA UMA LISTA QUE PODE GUARDAR QUALQUER OBJETO QUE SEJA UM "IMeioTransporte"
        List<IMeioTransporte> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Bicicleta());
        veiculos.add(new Trem());

        // # ACELERA TODOS OS VEÍCULOS DA LISTA
        System.out.println("\n# ACELERANDO...");
        // # POLIMORFISMO EM AÇÃO: NÃO IMPORTA SE É CARRO, BICICLETA OU TREM, TODOS SABEM "acelerar()"
        for (IMeioTransporte veiculo : veiculos) {
            veiculo.acelerar();
        }

        // # FREIA TODOS OS VEÍCULOS DA LISTA
        System.out.println("\n# FREANDO...");
        // # O MESMO ACONTECE AQUI: CADA VEÍCULO EXECUTA SUA PRÓPRIA VERSÃO DE "frear()"
        for (IMeioTransporte veiculo : veiculos) {
            veiculo.frear();
        }
    }
}