package CalculadoraSimples;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora de JAVA!\n");

        System.out.println("insira o primeiro numero");
        int opt = scan.nextInt();

        System.out.println(opt);

        scan.close();
    }
}
