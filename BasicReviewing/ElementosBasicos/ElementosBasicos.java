package ElementosBasicos;

import java.util.ArrayList;

public class ElementosBasicos {
    
    public static void main(String[] args) {
        

            //Tipos

        //tipo numero inteiro
            byte tipoByte = 1; //8 bits > -128 a 128
                System.out.println("\"byte\", numero inteiro entre -128 a 128");

            short tipoShort; // 16 bits > -32.768 a 32.768
                System.out.println("\"short\" numero inteiro entre -32.768 a 32.768");

            int tipoInt = 1; // 36 bits -2.147.483.683.648 a 2.147.483.683.648
                System.out.println("\"int\" numero inteiro entre -2.147.483.683.648 a 2.147.483.683.648");

            long tipoLong;
                System.out.println("\"long\" numeros gigantescos");

        //Numeros decimais
            float tipoFloat;
                System.out.println("\"float\" tipo para precisao simples");

            double tipoDouble;
                System.out.println("\"double\" tipo para precisao dupla");

        //tipos para caracteres

            char tipoChar;
                System.out.println("\"char\" tipo para armazenamento de um unico caractere");

            String tipoString;
                System.out.println("\"String\" tipo para armazenamento de uma sequencia de caracteres");

                System.out.println("\n\n\n");



            //condicionais

        if (tipoInt == 1){

                System.out.println(" -if- condicinal para que algo aconteca caso a condicao seja satisfeita");

        } else{
            System.out.println("o -else- é o que acontecerá caso a condição não seja satisfeita");
        }



            //Vetores

        System.out.println("\n Os vetores são declarados pela variavel segudo de \"[]\" com o numero de posições.\n A contagem de posicoes é realizada a partir do elemento 0");

        int vetInt[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String vetString[] = {"Matheus","Teixeira","Moraes"};

        System.out.println("Printando os elementos de um vetor de INT");
        for (int i=0; i<10; i++){

            System.out.println(vetInt[i]);

        }
        for (int i=0; i<3; i++){

            System.out.println(vetString[i]);

        }

        System.out.println("Por outro lado, um vetor necessita ter seu tamanho definido,\ncaso deseje que seu vetor tenha um tamanho não definido,\nserá necessário o uso de outra forma de declaração");

        ArrayList<String> arrayListStrings = new ArrayList<>();

        arrayListStrings.add("\nPara adicionar um elemento basta utilizar o <nomedoarrey>.add");
        
        System.out.println(arrayListStrings.get(0));

        System.out.println("para remover um elemento, se utiliza <nomedoarrey>.remove, tendo como parametro ou a posicao ou o elemento");

        arrayListStrings.remove(0);




            //loops
        System.out.println("loop \"For\" possibilita o controle dos pacos");
        for(int i=0; i < 4; i++){

            

            System.out.println(tipoByte);
            tipoByte ++;

        }


        while(true){
            System.out.println("\"while\" é utilizado para que a verificação seja realizada antes da execuçao do bloco");
            break;
        }

        do{
            System.out.println("O loop \\\"do while\\\" executa pelo menos uma vez antes de testar a condição");
            break;
        }while(true);
    }

}
