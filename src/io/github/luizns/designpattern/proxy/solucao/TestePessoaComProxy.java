package io.github.luizns.designpattern.proxy.solucao;

import io.github.luizns.designpattern.builder.Pessoa;
import io.github.luizns.designpattern.proxy.PessoaService;

import java.time.LocalDate;

public class TestePessoaComProxy {

    public static void main(String[] args) {
        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();

        NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy();
        PessoaService pessoaService = new PessoaService(novoPessoaRepositoryProxy);


        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .sobreNome("Silva")
                .dataNascimento(LocalDate.of(1986, 7, 7))
                .nome("Luiz")
                .apelido("luizns")
                .documento("12378946500")
                .build();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);

        Pessoa pessoaRetornadaCache = pessoaService.findById(1L);
        System.out.println(pessoaRetornadaCache);
    }
}
