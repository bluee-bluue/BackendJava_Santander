package Estoque;

import Calculo.CalculoPreco;
import Calculo.CalculoPrecoComImposto;

public class SistemaEstoque {
    private Estoque estoque;
    private CalculoPreco calculoPreco;

    public SistemaEstoque() {
        this.estoque = Estoque.getInstancia();
        this.calculoPreco = new CalculoPrecoComImposto();
    }

    public void adicionarProduto(Produto produto) {
        this.estoque.adicionarProduto(produto);
    }

    public double calcularPreco(Produto produto) {
        return this.calculoPreco.calcularPreco(produto);
    }
}
