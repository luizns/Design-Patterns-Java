package io.github.luizns.designpattern.templatemethod.solucao;

import io.github.luizns.designpattern.templatemethod.VeiculoParaReparo;

public abstract class ReparoVeiculoService {


    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoService(VeiculoParaReparo veiculoParaReparo) {
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

    protected abstract boolean veiculoParaReparo();


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
