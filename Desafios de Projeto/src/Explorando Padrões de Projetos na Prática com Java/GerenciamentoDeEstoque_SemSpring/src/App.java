import Estoque.Produto;
import Estoque.SistemaEstoque;

public class App {
    public static void main(String[] args) {
        // Criando o Estoque
        SistemaEstoque sistemaEstoque = new SistemaEstoque();

        // Criando o Produto
        Produto produto = new Produto(
                001, "Camiseta Onbongo", 50.00);

        // Adicionando o Produto ao Estoque
        sistemaEstoque.adicionarProduto(produto);

        // Calculando o Preço do Produto
        double preco = sistemaEstoque.calcularPreco(produto);

        // Imprimindo o Preço do Produto
        System.out.printf("O produto: " + produto.getNome() + " custa R$ %.2f", preco);
    }
}
