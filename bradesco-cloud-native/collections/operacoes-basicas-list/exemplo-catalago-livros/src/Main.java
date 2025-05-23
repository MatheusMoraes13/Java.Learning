import CatalagoLivros.models.CatalagoLivros;

public class Main {
    public static void main(String[] args) throws Exception {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalagoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 3", 2022);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
        catalagoLivros.adicionarLivro("Livro 5", "Autor 4", 2024);
        catalagoLivros.adicionarLivro("Livro 6", "Autor 5", 1994);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 4"));

        System.out.println(catalagoLivros.pesquisaPorIntervaloAnos(2020, 2024));

        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
