package io.github.luizns.designpattern.factorymethods.solucao;

import io.github.luizns.designpattern.factorymethods.Produto;
import io.github.luizns.designpattern.factorymethods.ProdutoDigital;
import io.github.luizns.designpattern.factorymethods.ProdutoFisico;
import io.github.luizns.designpattern.factorymethods.TipoProdutoEnum;

public class ProdutoFactory {

    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {
        switch (tipoProdutoEnum) {
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(true);
                return produtoDigital;
            default:
                throw new IllegalArgumentException("Tipo de Produto não disponível");
        }
    }

}
