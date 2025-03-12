import java.util.ArrayList;

public class Estoque {

    public ArrayList<Carros> estoqueCarros;
    public String nomeloja;

    public Estoque (String concecionaria){

        this.nomeloja = concecionaria;
        this.estoqueCarros = new ArrayList<> ();


    }

    public void adicionarEstoque (Carros carro){

    this.estoqueCarros.add (carro);

    }

    public void printCarroEstoque (int id){

        Carros carroprint = estoqueCarros.get(id);

        System.out.println("Marca: "+ carroprint.marca);
        System.out.println("Modelo: "+ carroprint.modelo);
        System.out.println("cor: "+ carroprint.cor);
        System.out.println("preco: "+ carroprint.preco);



    }
    
}
