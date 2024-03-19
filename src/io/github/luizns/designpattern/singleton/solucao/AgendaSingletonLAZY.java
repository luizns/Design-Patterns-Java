package io.github.luizns.designpattern.singleton.solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLAZY {

    private static AgendaSingletonLAZY INSTANCE = null;
    private Map<String, Boolean> diasDisponiveis = new HashMap<>();


    public static AgendaSingletonLAZY getInstance() {

        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new AgendaSingletonLAZY();
            return INSTANCE;
        }
        return INSTANCE;
    }

    private AgendaSingletonLAZY() {
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
