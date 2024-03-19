package io.github.luizns.designpattern.proxy.solucao;

import io.github.luizns.designpattern.builder.Pessoa;

public interface ProxyPessoa {
    void save(Pessoa pessoa);

    Pessoa findById(Long id);
}
