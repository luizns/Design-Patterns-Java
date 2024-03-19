package io.github.luizns.designpattern.chainofresponsibility.solucao;

import io.github.luizns.designpattern.chainofresponsibility.Carro;
import io.github.luizns.designpattern.chainofresponsibility.Marca;

import java.math.BigDecimal;

public class DescontoCarroValorMaiorQueCemMil extends DescontoCarro {

    public DescontoCarroValorMaiorQueCemMil(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesonto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0)
            return valorVenda.subtract(new BigDecimal(10000));

        return proximoDesconto.aplicaDesonto(carro);
    }
}
