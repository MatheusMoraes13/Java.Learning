import java.util.Scanner;

public class IntrouducaoPOO {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("A primeira cosia que podemos ver, é a questão de classes");
        System.out.println("\nUma classe é uma espécie de definição para objetos, que serao do tipo dessa classe");

        System.out.println("Exemplo a classe carros:");

        char marca;
        System.out.println("\n\n\nInsira o nome do carro: ");
        scan (marca);

        char modelo;
        System.out.println("Insira o modelo do carro");
        scan (modelo);

        char cor;
        System.out.println("Insira a cor do carro");
        scan (cor);

        int preco;
        System.out.println("Insira o preco do carro");
        scan (preco);

        Carros carros = new Carro(marca, modelo, cor, preco);

        System.out.println("Marca do carro ", carro.nome);

    }
    
}
