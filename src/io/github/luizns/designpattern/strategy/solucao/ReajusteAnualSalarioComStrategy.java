package io.github.luizns.designpattern.strategy.solucao;

import io.github.luizns.designpattern.strategy.Funcionario;

public class ReajusteAnualSalarioComStrategy {

    public void calculaReajusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador) {

        calculador.calcularReajusteAnual(funcionario);
    }
}
