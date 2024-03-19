package io.github.luizns.designpattern.templatemethod.solucao;

import io.github.luizns.designpattern.templatemethod.VeiculoParaReparo;

public class ReparaVeiculoComumServiceComTemplateMethod extends ReparoVeiculoService {

    private VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoComumServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
        super(veiculoParaReparo);
        this.veiculoParaReparo = veiculoParaReparo;
    }


    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }

}
