// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio05_abstracao;

// # IMPORTA A FERRAMENTA DE DINHEIRO
import java.math.BigDecimal;

// # DEFINE A CLASSE ABSTRATA: ELA SERVE COMO UM MODELO E NÃO PODE SER INSTANCIADA DIRETAMENTE
public abstract class FormaPagamento {
    
    // # MÉTODO ABSTRATO: SEM CÓDIGO, OBRIGA AS CLASSES FILHAS A IMPLEMENTÁ-LO
    public abstract void validarPagamento() throws PagamentoInvalidoException;
    
    // # MÉTODO CONCRETO: JÁ TEM UMA LÓGICA PRONTA QUE AS CLASSES FILHAS PODEM USAR
    public void processarPagamento(BigDecimal valor) throws PagamentoInvalidoException {
        // # EXECUTA PRIMEIRO A VALIDAÇÃO ESPECÍFICA DE CADA FILHA
        validarPagamento();
        
        // # EXECUTA A LÓGICA COMUM DE PROCESSAMENTO
        System.out.println("Processando pagamento de R$ " + valor + " via " + this.getClass().getSimpleName());
        // ... aqui entraria a lógica real de comunicação com o banco, etc.
        System.out.println("Pagamento concluído com sucesso!");
    }
}