package io.github.luizns.designpattern.chainofresponsibility.solucao;

import io.github.luizns.designpattern.chainofresponsibility.Carro;
import io.github.luizns.designpattern.chainofresponsibility.Marca;

import java.math.BigDecimal;

public class DescontoCarroFiat extends DescontoCarro {

    public DescontoCarroFiat(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesonto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if (Marca.FIAT.equals(carro.getMarca()))
            return valorVenda.subtract(new BigDecimal(1000));

        return proximoDesconto.aplicaDesonto(carro);
    }
}
