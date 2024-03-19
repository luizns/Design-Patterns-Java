package io.github.luizns.designpattern.singleton.solucao;

import io.github.luizns.designpattern.singleton.problema.Agenda;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaComSingleton {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);

        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sabado");

        AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);

        // reflection
        Constructor<AgendaSingletonLAZY> construtorTravesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);

        AgendaSingletonLAZY agendaTravessa = construtorTravesso.newInstance();
        AgendaSingletonLAZY agendaTravessa2 = construtorTravesso.newInstance();

        System.out.println(agendaTravessa.hashCode());
        System.out.println(agendaTravessa2.hashCode());

        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sabado");


        AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
        AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();
        System.out.println(agenda1.hashCode());
        System.out.println(agenda2.hashCode()); */

        // reflection
        Constructor<AgendaSingletonEnum> construtorTravesso = AgendaSingletonEnum.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);

        AgendaSingletonEnum agendaTravessa = construtorTravesso.newInstance();
        AgendaSingletonEnum agendaTravessa2 = construtorTravesso.newInstance();

        System.out.println(agendaTravessa.hashCode());
        System.out.println(agendaTravessa2.hashCode());

        reservaDiaEnum("Sexta");
        reservaDiaEnum("Sabado");

    }

    public static void reservaDiaEAGER(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
    }

    public static void reservaDiaLAZY(String dia) {
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
    }

    public static void reservaDiaEnum(String dia) {
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
    }
}
