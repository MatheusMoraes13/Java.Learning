package CarrinhoCompras.models;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //Instanciando uma lista para os itens do carrinho
    private List<Item> itemList;

    //Construtor que iniciará uma lista ao instanciar um novo objeto da classe CarrinhoDeCompras
    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    //Realizando a operação de adicionar um novo item a lista de itens do carrinho.
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    //Removendo um item do carrinho a partir do seu nome
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()){
            for (Item t: itemList){
                if (t.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(t);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double total = 0;
        if (!itemList.isEmpty()){
            for (Item t: itemList){
                total = t.getPreco()*t.getQuantidade();
                }
            } else {
            System.out.println("A lista está vazia!");
        }
        return total;
    }

    public void exibirItens(){
        if (!itemList.isEmpty()){
            System.out.println(itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

}
