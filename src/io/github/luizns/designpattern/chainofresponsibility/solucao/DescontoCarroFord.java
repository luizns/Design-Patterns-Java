package io.github.luizns.designpattern.chainofresponsibility.solucao;

import io.github.luizns.designpattern.chainofresponsibility.Carro;
import io.github.luizns.designpattern.chainofresponsibility.Marca;

import java.math.BigDecimal;

public class DescontoCarroFord extends DescontoCarro {

    public DescontoCarroFord(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesonto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if (Marca.FORD.equals(carro.getMarca()))
            return valorVenda.subtract(new BigDecimal(2000));

        return proximoDesconto.aplicaDesonto(carro);
    }
}
