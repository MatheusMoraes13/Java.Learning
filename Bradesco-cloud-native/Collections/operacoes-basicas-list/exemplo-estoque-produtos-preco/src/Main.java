import models.*;

public class Main {
    public static void main(String[] args) throws Exception {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 2, 15.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque é = R$" + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Produto mais barato do estoque é = R$" + estoqueProdutos.obterProdutoMaisBarato());

        System.out.println("Produto mais caro do estoque é = R$" + estoqueProdutos.obterProdutoMaisCaro());

        System.out.println("O produto com maior valor montate do estoque é = R$" + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());


    }
}
