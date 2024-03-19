package io.github.luizns.designpattern.proxy;

import io.github.luizns.designpattern.builder.Pessoa;
import io.github.luizns.designpattern.proxy.solucao.PessoaRepositoryProxy;
import io.github.luizns.designpattern.proxy.solucao.ProxyPessoa;

public class PessoaService {

    private ProxyPessoa proxyPessoa;

    public PessoaService(ProxyPessoa proxyPessoa) {
        this.proxyPessoa = proxyPessoa;
    }

    public void save(Pessoa pessoa) {
        proxyPessoa.save(pessoa);
    }

    public Pessoa findById(Long id) {
        return  proxyPessoa.findById(id);
    }


}
