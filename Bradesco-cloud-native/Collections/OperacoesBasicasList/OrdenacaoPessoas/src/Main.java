import OrdenacaoPessoas.models.OrdenacaoPessoa;

public class Main {
    public static void main(String[] args) throws Exception {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Brenda Ferreira Marques", 19, 1.60);
        ordenacaoPessoa.adicionarPessoa("Matheus Teixeira Moraes", 20, 1.80);
        ordenacaoPessoa.adicionarPessoa("Antonia Margareth Teixeira Moraes", 49, 1.56);
        ordenacaoPessoa.adicionarPessoa("Marzo de Vasconcelos Moraes", 50, 1.75);

        System.out.println(ordenacaoPessoa.ordenadoPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
