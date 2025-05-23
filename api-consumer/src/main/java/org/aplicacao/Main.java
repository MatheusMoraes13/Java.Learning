package org.aplicacao;

import org.aplicacao.service.APIservice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        APIservice apiservice = new APIservice();
        Scanner scanner = new Scanner(System.in);

        String cep;
        System.out.println("Insira o CEP o qual deseja consultar: ");
        cep = scanner.nextLine();

        if (cep.length() > 8){
            System.out.println("CEP inválido");
        }

        System.out.println(apiservice.getAddres(cep));

    }
}