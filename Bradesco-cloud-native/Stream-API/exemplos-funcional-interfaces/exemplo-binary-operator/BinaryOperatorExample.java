
import java.util.Arrays;
import java.util.List;

/*
 * Representa uma operação que combina dois elementos de um tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */

public class BinaryOperatorExample {

    public static void main(String[] args) {
        // Criar uma lista com números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        //BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // Usar BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
        .reduce(0, Integer :: sum);

        // imprimir o resutado da soma

        System.out.println("A soma dos números é: " + resultado);
    }

}
