package io.github.luizns.designpattern.prototype.solucao;

import io.github.luizns.designpattern.prototype.Botao;
import io.github.luizns.designpattern.prototype.TipoBordaEnum;

import java.util.HashMap;
import java.util.Map;

public class BotaoRegistry {

    private static BotaoRegistry botaoRegistry;

    public static Map<String, Botao> REGISTRY = new HashMap<>();

    static {
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBordaEnum(TipoBordaEnum.TRACEJADA);
        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBordaEnum(TipoBordaEnum.TRACEJADA);
        Botao botaoVermelho = new Botao();
        botaoVermelho.setCor("Vermelho");
        botaoVermelho.setAltura(70);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBordaEnum(TipoBordaEnum.FINA);


        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
        REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
        REGISTRY.put("BOTAO_AZUL", botaoAzul);
    }

    public static Botao getBotao(String chave) {
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

    public static void addRegistry(String chave, Botao botao) {

        REGISTRY.put(chave, botao);
    }
}
