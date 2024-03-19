package io.github.luizns.designpattern.proxy.problema;

import io.github.luizns.designpattern.builder.Pessoa;
import io.github.luizns.designpattern.proxy.PessoaRepository;
import io.github.luizns.designpattern.proxy.PessoaService;

import java.time.LocalDate;

public class PessoaTest {
    public static void main(String[] args) {

    /*    PessoaService pessoaService = new PessoaService(new PessoaRepository());

        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .sobreNome("Silva")
                .dataNascimento(LocalDate.of(1986, 7, 7))
                .nome("Luiz")
                .apelido("luizns")
                .documento("12378946500")
                .build();

        pessoaService.save(pessoa);
        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);*/
    }
}
