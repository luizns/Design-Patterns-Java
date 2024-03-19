package io.github.luizns.designpattern.adapter.solucao;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrenteAdapter {
    private JarOperacoesContaCorrenteAdapter jarContaAdapter;

    public ClientJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jarAdapter) {
        this.jarContaAdapter = jarAdapter;
    }

    public void saca(BigDecimal valorPretendido) {
        jarContaAdapter.saca(valorPretendido);
    }

    public void deposita(BigDecimal valor) {
        jarContaAdapter.deposita(valor);
    }
}
