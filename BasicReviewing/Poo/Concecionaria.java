import java.util.Scanner;

public class Concecionaria {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Exemplo a classe carros:");

        String marca;
        System.out.println("\n\n\nInsira a marca do carro: ");
        marca = scan.nextLine ();

        String modelo;
        System.out.println("Insira o modelo do carro");
        modelo = scan.nextLine ();

        String cor;
        System.out.println("Insira a cor do carro");
        cor = scan.nextLine ();

        int preco;
        System.out.println("Insira o preco do carro");
        preco = scan.nextInt();

        Carros carros = new Carros (marca, modelo, cor, preco);

        String nomeconcecionaria;
        System.out.println("insira o nome da concecionaria a qual voce trabalha");
        nomeconcecionaria = scan.nextLine();

        Estoque estoque = new Estoque(nomeconcecionaria);

        estoque = Estoque.AdicionarEstoque (carros);

        System.out.println("nome da concecionaria = %s\nmarca do carro adicionado = %s" estoque.concecionaria, estoque.get(0);


        System.out.println("Marca do carro = " + carros.marca);

    }
    
}
