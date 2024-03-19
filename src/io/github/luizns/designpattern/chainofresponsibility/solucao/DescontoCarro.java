package io.github.luizns.designpattern.chainofresponsibility.solucao;

import io.github.luizns.designpattern.chainofresponsibility.Carro;

import java.math.BigDecimal;

public abstract class DescontoCarro {

    protected DescontoCarro proximoDesconto;

    public DescontoCarro(DescontoCarro proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    public abstract BigDecimal aplicaDesonto(Carro carro);

}
