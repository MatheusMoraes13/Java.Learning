package candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args){
        System.out.println("PROCESSO SELETIVO");

        String [] candidatos = {"matheus", "brenda", "felipe", "marcia", "julia"};

        for (String candidato: candidatos){
            entrandoEmcontato(candidato);
        }

    }

    static void entrandoEmcontato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {

            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando){
                tentativasRealizadas ++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }

        }while (continuarTentando == true && tentativasRealizadas == 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas escedido");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){

        String [] candidatos = {"matheus", "brenda", "felipe", "marcia", "julia"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice ++){

            System.out.println("O candidato de n " + (indice+1) + " é " + candidatos[indice]);

        }

        System.out.println("forma abreviada de interação for each");

        for (String candidato: candidatos){

            System.out.println("O candidato selecionado foi " + candidato);

        }

    }

    static void selecaoCandidatos (){

        String [] candidatos = {"matheus", "brenda", "felipe", "marcia", "julia", "paulo", "augusto", "monica", "fabricio", "mirela"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido ();

            System.out.println("O candidato" + candidato + "Solicitou este valor de salário" + salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                
                candidatosSelecionados ++;
            }

            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } 
        
        else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM UMA CONTRA PROPOSTA");
        } 
        
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
