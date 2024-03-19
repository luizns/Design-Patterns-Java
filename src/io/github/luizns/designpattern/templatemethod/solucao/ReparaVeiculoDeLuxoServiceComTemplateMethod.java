package io.github.luizns.designpattern.templatemethod.solucao;

import io.github.luizns.designpattern.templatemethod.VeiculoParaReparo;

public class ReparaVeiculoDeLuxoServiceComTemplateMethod extends ReparoVeiculoService {

    private VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoDeLuxoServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
        super(veiculoParaReparo);
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;

    }
}
