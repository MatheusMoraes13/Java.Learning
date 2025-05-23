
import java.util.List;
import java.util.stream.Stream;


/*Representa uma operação que não aceita nenhum argumento e retorna um resutado do tipo T.
 *É comumente usada para ccriar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExample {
    public static void main(String[] args) {

        // Ussar o Suppplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)").limit(5).toList();

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out :: println);
    }

}
