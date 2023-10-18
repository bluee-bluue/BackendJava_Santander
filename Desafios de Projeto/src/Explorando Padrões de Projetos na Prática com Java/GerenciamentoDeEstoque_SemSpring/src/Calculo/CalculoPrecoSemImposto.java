package Calculo;

import Estoque.Produto;

public class CalculoPrecoSemImposto implements CalculoPreco {
    @Override
    public double calcularPreco(Produto produto) {
        return produto.getPreco();
    }
}
