package io.github.luizns.designpattern.templatemethod.solucao;

import io.github.luizns.designpattern.templatemethod.VeiculoParaReparo;
import io.github.luizns.designpattern.templatemethod.problema.ReparaVeiculoComumService;
import io.github.luizns.designpattern.templatemethod.problema.ReparaVeiculoDeLuxoService;

public class TesteReparaVeiculosComTemplateMethod {

    public static void main(String[] args) {
        System.out.println("-".repeat(20) + " LUXO " + "-".repeat(20));
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(51);

        ReparoVeiculoService rpl = new ReparaVeiculoDeLuxoServiceComTemplateMethod(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println();
        System.out.println("-".repeat(20) + " COMUM " + "-".repeat(20));

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();

        veiculoComum.setPorcentagemDano(69);

        ReparoVeiculoService rpc = new ReparaVeiculoComumServiceComTemplateMethod(veiculoComum);
        rpc.reparaVeiculo();
    }
}
