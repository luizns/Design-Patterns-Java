package io.github.luizns.designpattern.templatemethod.problema;

import io.github.luizns.designpattern.templatemethod.VeiculoParaReparo;

public class TesteReparaVeiculos {

    public static void main(String[] args) {
        System.out.println("-".repeat(20) + " LUXO " + "-".repeat(20));
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(51);

        ReparaVeiculoDeLuxoService rpl = new ReparaVeiculoDeLuxoService(veiculoDeLuxo);
        rpl.reparaVeiculo();

        System.out.println();
        System.out.println("-".repeat(20) + " COMUM " + "-".repeat(20));

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(69);

        ReparaVeiculoComumService rpc = new ReparaVeiculoComumService(veiculoComum);
        rpc.reparaVeiculo();
    }
}
