import Models.Maquina;
import Models.Pet;
import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Maquina maquina = new Maquina();

    public static void main(String[] args) {
        
        int option = - 1;

        do {

            System.out.println("==========Escolha uma das Opções==========");

            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer máquina com água");
            System.out.println("2 - Abastecer máquina com shampoo");
            System.out.println("3 - Verificar água da máquina");
            System.out.println("4 - Verificar shampoo da máquina");
            System.out.println("5 - Verificar se tem pet no banho");
            System.out.println("6 - Colocar pet na máquina");
            System.out.println("7 - Retirar pet da máquina");
            System.out.println("8 - Limpar a máquina");
            System.out.println("9 - sair");

            option = scanner.nextInt();

            switch (option) {
                
                case 6:
                    setPetInPetMachine();
                    break;

                case 7:
                    maquina.removePet();
                    break;

                case 8:
                    maquina.wash();
                    break;
            
                default:
                    break;
            }

        }while (option != 0);
    }

    public static void setPetInPetMachine(){
        System.out.println("Informe o nome do Pet");

        String name = "";

        while (name == null || name.isEmpty()){
        name = scanner.next();
        
        }
        Pet pet = new Pet(name);
        
        maquina.setPet(pet);
        System.out.println("O Pet" + pet.getNome() + "foi colocado na maquina");
    }
}
