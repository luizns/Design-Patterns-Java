package io.github.luizns.designpattern.proxy.solucao;

import io.github.luizns.designpattern.builder.Pessoa;
import io.github.luizns.designpattern.proxy.PessoaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository implements ProxyPessoa {

    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private Map<Long, Pessoa> cache = new HashMap<>();

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamada do metodo save... ");
        super.save(pessoa);
        log.info("Chamada do metodo save finalizada.");
    }

    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando chamada do metodo FindById... ");
        Long inicio = System.currentTimeMillis();

        Pessoa pessoa = null;

        if (Objects.nonNull(cache.get(id))) {
            log.info("Esta pegando do cache");
            pessoa = cache.get(id);
        } else {
            log.info("Esta pegando PessoaRepository.");
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }

        log.info("Chamada do metodo findById finalizada.");
        Long fim = System.currentTimeMillis();

        log.info("\nTempo gasto na chamada. " + (fim - inicio));
        return pessoa;
    }
}
