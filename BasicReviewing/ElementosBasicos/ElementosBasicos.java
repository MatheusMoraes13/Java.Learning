package ElementosBasicos;

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
                System.out.println("\"double\" numeros gigantescos");

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

                System.out.println("condicinal para que algo aconteca caso a condicao seja satisfeita");

        } else{
            System.out.println("o -else- é o que acontecerá caso a condição não seja satisfeita");
        }


            //loops
        
        for(int i=0; i < 4; i++){

            System.out.println("loop utilizado quando há um numero definido de repetições");

            System.out.println(tipoByte);
            tipoByte ++;

        }


    }

}
