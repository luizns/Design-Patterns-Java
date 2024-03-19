package io.github.luizns.designpattern.factorymethods.problema;

import io.github.luizns.designpattern.factorymethods.ProdutoDigital;
import io.github.luizns.designpattern.factorymethods.ProdutoFisico;

public class TesteProduto {

    public static void main(String[] args) {

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);


    }

}
