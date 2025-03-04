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

        Estoque estoque = new Estoque("Honda");

        estoque.adicionarEstoque(carros);

        estoque.printCarroEstoque(1);


        System.out.println("Marca do carro = " + carros.marca);

        scan.close();
    }
    
}
