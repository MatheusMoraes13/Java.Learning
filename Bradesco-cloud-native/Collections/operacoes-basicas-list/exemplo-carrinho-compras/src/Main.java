import CarrinhoCompras.models.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Mouse", 150, 1);
        carrinhoDeCompras.adicionarItem("Memória RAM 8gb", 120, 2);

        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Mouse");
        carrinhoDeCompras.exibirItens();

    }
}
