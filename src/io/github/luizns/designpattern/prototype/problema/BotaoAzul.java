package io.github.luizns.designpattern.prototype.problema;

import io.github.luizns.designpattern.factorymethods.TipoProdutoEnum;
import io.github.luizns.designpattern.prototype.Botao;
import io.github.luizns.designpattern.prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {


    public BotaoAzul() {
        setCor("Azul");
        setAltura(35);
        setLargura(125);
        setTipoBordaEnum(TipoBordaEnum.TRACEJADA);
    }
}
