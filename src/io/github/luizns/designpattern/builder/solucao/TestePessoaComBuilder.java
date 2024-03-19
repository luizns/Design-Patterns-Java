package io.github.luizns.designpattern.builder.solucao;

import io.github.luizns.designpattern.builder.Pessoa;

import java.time.LocalDate;

public class TestePessoaComBuilder {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .sobreNome("nascimento")
                .nome("luiz")
                .documento("0269192900")
                .email("luns.wm@gmail.com")
                .apelido("luizns")
                .dataNascimento(LocalDate.of(1988, 3, 30))
                .build();

        System.out.println(pessoa);
    }
}
