package SomaNumeros.models;

import java.util.ArrayList;
import java.util.List;

public class SomarNumeros {
    private List<Integer> intList;

    public SomarNumeros(){
        this.intList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        intList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;

        for (Integer i : intList){
            soma += i;
        }

        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;

        for (Integer i : intList){
            if (i > maiorNumero){
                maiorNumero = i;
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 10000;

        for (Integer i : intList){
            if (i < menorNumero){
                menorNumero = i;
            }
        }

        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(intList);
    }

}
