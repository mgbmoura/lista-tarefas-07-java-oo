// # DEFINE O "PACOTE" ONDE A CLASSE ESTÁ ORGANIZADA
package com.marcelo.exercicios.exercicio06_imutabilidade;

// # IMPORTA AS FERRAMENTAS NECESSÁRIAS
import java.math.BigDecimal;
import java.util.Objects;

// # A PALAVRA 'final' NA CLASSE IMPEDE QUE ELA SEJA HERDADA
public final class Dinheiro {
    // # ATRIBUTOS 'final' GARANTEM QUE, APÓS SEREM DEFINIDOS NO CONSTRUTOR, NUNCA MAIS MUDARÃO
    private final BigDecimal valor;
    private final Moeda moeda;

    // # CONSTRUTOR QUE INICIALIZA OS ATRIBUTOS FINAIS
    public Dinheiro(BigDecimal valor, Moeda moeda) {
        // # VALIDA SE O VALOR É VÁLIDO
        if (valor == null || valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor não pode ser nulo ou negativo.");
        }
        this.valor = valor;
        this.moeda = moeda;
    }

    // # APENAS GETTERS SÃO FORNECIDOS. NÃO EXISTEM SETTERS PARA GARANTIR A IMUTABILIDADE.
    public BigDecimal getValor() { return valor; }
    public Moeda getMoeda() { return moeda; }

    // # SOBRESCREVE 'equals' E 'hashCode' PARA COMPARAR OBJETOS PELO SEU VALOR, E NÃO PELA REFERÊNCIA
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dinheiro dinheiro = (Dinheiro) o;
        return Objects.equals(valor, dinheiro.valor) && moeda == dinheiro.moeda;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, moeda);
    }
    
    // # MÉTODO PARA FACILITAR A VISUALIZAÇÃO DO OBJETO
    @Override
    public String toString() {
        return moeda + " " + valor;
    }
}