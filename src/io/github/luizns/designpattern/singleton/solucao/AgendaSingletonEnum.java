package io.github.luizns.designpattern.singleton.solucao;

import java.util.HashMap;
import java.util.Map;

public enum AgendaSingletonEnum {

    INSTANCE;
    private Map<String, Boolean> diasDisponiveis = new HashMap<>();


    public static AgendaSingletonEnum getInstance() {
        return INSTANCE;
    }

    private AgendaSingletonEnum() {
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunga", Boolean.TRUE);
        diasDisponiveis.put("Terca", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sabado", Boolean.TRUE);
    }

    public Map<String, Boolean> getDiasDisponiveis() {
        return diasDisponiveis;
    }

    public void ocupa(String dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }
}
