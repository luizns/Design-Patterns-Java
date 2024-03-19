package io.github.luizns.designpattern.adapter.solucao;

import io.github.luizns.designpattern.adapter.problema.ClientJarOperacoesContaCorrente;
import io.github.luizns.designpattern.adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrenteAdapter {

    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();

        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);
        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

        client.saca(valorPretendidoParaSaque);

        client.deposita(new BigDecimal(500));


    }
}
