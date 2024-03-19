package io.github.luizns.designpattern.prototype.problema;

import io.github.luizns.designpattern.factorymethods.TipoProdutoEnum;
import io.github.luizns.designpattern.prototype.Botao;
import io.github.luizns.designpattern.prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {

    public BotaoVermelho() {
        setCor("Vermelho");
        setAltura(70);
        setLargura(100);
        setTipoBordaEnum(TipoBordaEnum.FINA);
    }
}
