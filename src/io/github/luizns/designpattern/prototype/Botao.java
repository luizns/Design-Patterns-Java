package io.github.luizns.designpattern.prototype;

public class Botao {
    protected String cor;
    protected int largura;
    protected int altura;
    protected TipoBordaEnum tipoBordaEnum;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public TipoBordaEnum getTipoBordaEnum() {
        return tipoBordaEnum;
    }

    public void setTipoBordaEnum(TipoBordaEnum tipoBordaEnum) {
        this.tipoBordaEnum = tipoBordaEnum;
    }

    @Override
    public String toString() {
        return "Botao{" +
                "cor='" + cor + '\'' +
                ", largura=" + largura +
                ", altura=" + altura +
                ", tipoBordaEnum=" + tipoBordaEnum +
                '}';
    }
}
