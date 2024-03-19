package io.github.luizns.designpattern.prototype.solucao;

import io.github.luizns.designpattern.prototype.Botao;
import io.github.luizns.designpattern.prototype.TipoBordaEnum;

public class TesteBotaoPrototype {

    public static void main(String[] args) {
        //BotaoRegistry registry = BotaoRegistry.getInstance();

        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");

        System.out.println(botaoVermelho);
        System.out.println(botaoAzul);
        System.out.println(botaoAmarelo);

        botaoAmarelo.setCor("Laranja");
        System.out.println(botaoAmarelo);

        Botao botaoAmarelo2 = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo2);


        String chave = "BOTAO_PRETO";
        Botao botaoPreto = new Botao();
        botaoPreto.setCor("Preto");
        botaoPreto.setAltura(50);
        botaoPreto.setLargura(300);
        botaoPreto.setTipoBordaEnum(TipoBordaEnum.FINA);

        BotaoRegistry.addRegistry(chave, botaoPreto);

        Botao botaoPretoClone = BotaoRegistry.getBotao("BOTAO_PRETO");
        System.out.println(botaoPretoClone);
    }
}
