package io.github.luizns.designpattern.factorymethods.solucao;

import io.github.luizns.designpattern.factorymethods.Produto;
import io.github.luizns.designpattern.factorymethods.TipoProdutoEnum;

public class TesteProdutoComFactoryMethod {

    public static void main(String[] args) {

        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);

    }

}
