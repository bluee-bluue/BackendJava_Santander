package Estoque;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private static Estoque instancia;
    private List<Produto> produtos;

    private Estoque() {
        this.produtos = new ArrayList<>();
    }

    public static Estoque getInstancia() {
        if (instancia == null) {
            instancia = new Estoque();
        }
        return instancia;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }
}
