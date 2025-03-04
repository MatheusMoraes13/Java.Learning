import java.util.ArrayList;

public class Estoque {

    public ArrayList<Carros> estoqueCarros;
    public Carros carro;
    public String nomeloja;

    public Estoque (String concecionaria){

        this.nomeloja = concecionaria;
        this.estoqueCarros = new ArrayList<> ();


    }

    public void adicionarEstoque (Carros carro){

    this.estoqueCarros.add (carro);

    }

    public void printCarroEstoque (int id){

        System.out.println("carro pesquisado, referente ao ID"+ id + "é = "+ estoqueCarros.get(id));


    }
    
}
