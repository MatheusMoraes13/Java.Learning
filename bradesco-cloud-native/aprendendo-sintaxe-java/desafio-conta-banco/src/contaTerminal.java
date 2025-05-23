import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {

        criarConta ();
        
    }

    public static void criarConta(){

        Scanner scan = new Scanner(System.in);

        int numero;
        System.out.println("Por favor, digite o número da sua conta!");
        System.out.println("Número:");
        numero = scan.nextInt();

        String agencia;
        System.out.println("Por favor, digite o número da agência!");
        System.out.println("Número:");
        agencia = scan.nextLine();

        String nomeUsuario;
        System.out.println("Por favor, digite o seu nome!");
        System.out.println("Nome:");
        nomeUsuario = scan.nextLine();

        float saldo;
        System.out.println("Por favor, digite o seu saldo!");
        System.out.println("Saldo:");
        saldo = scan.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nomeUsuario, agencia, numero, saldo);

    }
}
