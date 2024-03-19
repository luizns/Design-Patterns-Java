package io.github.luizns.designpattern.chainofresponsibility.solucao;

import io.github.luizns.designpattern.chainofresponsibility.Carro;
import io.github.luizns.designpattern.chainofresponsibility.Marca;

import java.math.BigDecimal;

public class SemDireitoADesconto extends DescontoCarro {

    public SemDireitoADesconto(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesonto(Carro carro) {
        return BigDecimal.ZERO;
    }
}
