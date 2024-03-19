package io.github.luizns.designpattern.chainofresponsibility.solucao;

import io.github.luizns.designpattern.chainofresponsibility.Carro;
import io.github.luizns.designpattern.chainofresponsibility.Marca;

import java.math.BigDecimal;

public class VendaCarroServiceComChainOfResponsibility {
    public BigDecimal calculaValorVenda(Carro carro) {
        DescontoCarroFiat desconto = new DescontoCarroFiat(
                new DescontoCarroFord(
                        new DescontoCarroValorMaiorQueCemMil(
                                new SemDireitoADesconto(null)
                        )));

        return desconto.aplicaDesonto(carro);
    }
}
