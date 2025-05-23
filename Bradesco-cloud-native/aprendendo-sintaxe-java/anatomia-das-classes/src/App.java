public class App{

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume  atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        smartTv.trocarCana(210);



    }

}