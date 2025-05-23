import java.util.List;
import java.util.ArrayList;

public class GenericsExempleList {
    public static void main(String[] args) throws Exception {
        //Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); //Permite adicionar qualquer tipo de objeto

        // Exemplo sem Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("elemento 1");
        listaGenerics.add("elemento 2");

        // Iterando sobre a lista com Generics
        for (String elemento : listaGenerics){
            System.out.println(elemento);
        }

        // Iterando sobre a lista sem Generics (necessário fazer cast)
        for (Object elemento : listaSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }

    }
}
