public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar (){

        ligada = true;

    }

    public void desligar (){

        ligada = false;

    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando volume para: "+ volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo volume para: "+ volume);
    }

    public void aumentarCanal(){
        System.out.println("Diminuindo o canal!");
        canal ++;
        System.out.println("Canal atual: "+ canal);
    }

    public void diminuirCanal(){
        System.out.println("Diminuindo o canal!");
        canal --;
        System.out.println("Canal atual: "+ canal);
    }

    public void trocarCana(int novoCanal){
        System.out.println("Trocando de canal!");
        canal = novoCanal;
        System.out.println("Canal atual: "+ canal);
    }
}
