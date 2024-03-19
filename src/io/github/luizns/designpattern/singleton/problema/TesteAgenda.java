package io.github.luizns.designpattern.singleton.problema;

public class TesteAgenda {
    public static void main(String[] args) {
        resevaDia("Sexta");
        resevaDia("Sabado");
    }

    public static void resevaDia(String dia) {
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
    }
}
