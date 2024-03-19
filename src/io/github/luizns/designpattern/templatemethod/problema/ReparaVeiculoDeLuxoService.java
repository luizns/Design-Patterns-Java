package io.github.luizns.designpattern.templatemethod.problema;

import io.github.luizns.designpattern.templatemethod.VeiculoParaReparo;

public class ReparaVeiculoDeLuxoService {

    private VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoDeLuxoService(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    public void reparaVeiculo() {
        entradaOficina();
        analisarDanos();
        if (veiculoParaReparo()) {
            repararVeiculo();
            notificarReparoParaSeguradora();
        } else {
            notificarPerdaTotalParaSeguradora();
        }

    }

    private boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }


    private void notificarPerdaTotalParaSeguradora() {
        System.out.println("Notificar perda total para seguradora");

    }

    private void notificarReparoParaSeguradora() {
        System.out.println("Notificar reparo para seguradora");

    }


    private void repararVeiculo() {
        System.out.println("Reparando veiculo...");
    }

    private void analisarDanos() {
        System.out.println("Analisar Danos...");
    }

    private void entradaOficina() {
        System.out.println("Veiculo entrando Oficina...");
    }


}
