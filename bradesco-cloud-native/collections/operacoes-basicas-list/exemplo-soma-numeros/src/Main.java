import SomaNumeros.models.SomarNumeros;

public class Main {
    public static void main(String[] args) throws Exception {
        SomarNumeros somarNumeros = new SomarNumeros();

        somarNumeros.adicionarNumero(40);
        somarNumeros.adicionarNumero(82);
        somarNumeros.adicionarNumero(12);
        somarNumeros.adicionarNumero(8);

        System.out.println("Maior número: " + somarNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: "+ somarNumeros.encontrarMenorNumero());
        System.out.println("Soma dos números: " + somarNumeros.calcularSoma());


    }
}
