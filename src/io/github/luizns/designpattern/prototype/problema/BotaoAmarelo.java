package io.github.luizns.designpattern.prototype.problema;

import io.github.luizns.designpattern.factorymethods.TipoProdutoEnum;
import io.github.luizns.designpattern.prototype.Botao;
import io.github.luizns.designpattern.prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {

    public BotaoAmarelo() {
        setCor("Amarelo");
        setAltura(40);
        setLargura(100);
        setTipoBordaEnum(TipoBordaEnum.TRACEJADA);
    }
}
