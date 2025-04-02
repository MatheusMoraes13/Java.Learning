public class Carro extends Veiculo{
    
    public void ligar (){
        confereCombustivel();
        confereCambio();
        System.out.println("Carro Ligado");
    }

    private void confereCombustivel(){
        System.out.println("conferindo o combustivel");
    }

    private void confereCambio(){
        System.out.println("conferindo cambio em P");
    }
}
