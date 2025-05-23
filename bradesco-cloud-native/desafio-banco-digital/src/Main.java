import models.Banco;
import models.ContaCorrente;
import models.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        // Tenstando a funcionalidade do banco

        // Criando um banco para realizar o armazenamento das contas
        Banco banco = new Banco();

        // Criando duas contas, uma para cada tipo de conta;
        ContaCorrente contaCorrente1 = new ContaCorrente(123123, 123123, "CORRENTE");
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(321321, 321321,"POUPANCA");

        // Adicionando as contas ao banco
        banco.criarContaCorrente(321321, contaCorrente1);
        banco.criarContaPoupanca(123123, contaPoupanca1);

        System.out.println(banco.imprimirConta(123123));
        System.out.println(banco.imprimirConta(321321));

        contaPoupanca1.depositar(1000);
        contaCorrente1.depositar(1500);
        System.out.println(contaCorrente1.getSaldo());
        System.out.println(contaPoupanca1.getSaldo());


        contaPoupanca1.transferir(100, contaCorrente1);
        contaCorrente1.transferir(350, contaPoupanca1);
        System.out.println(contaCorrente1.getSaldo());
        System.out.println(contaPoupanca1.getSaldo());


        contaPoupanca1.sacar(250);
        contaCorrente1.sacar(250);
        System.out.println(contaCorrente1.getSaldo());
        System.out.println(contaPoupanca1.getSaldo());
    }
}
