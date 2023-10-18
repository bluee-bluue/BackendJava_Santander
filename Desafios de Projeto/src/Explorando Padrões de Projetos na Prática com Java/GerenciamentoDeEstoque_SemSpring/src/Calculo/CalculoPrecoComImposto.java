package Calculo;

import Estoque.Produto;

public class CalculoPrecoComImposto implements CalculoPreco {
    @Override
    public double calcularPreco(Produto produto) {
        return produto.getPreco() * 1.25;
    }
}
