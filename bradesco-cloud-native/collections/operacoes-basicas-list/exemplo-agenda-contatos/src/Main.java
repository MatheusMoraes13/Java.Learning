import models.*;

public class Main {
    public static void main(String[] args) throws Exception {
        AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.adicionarContato("Brenda Marques", 1234);
        agendaContatos.adicionarContato("Brenda Marques", 1221);
        agendaContatos.adicionarContato("Matheus Teixeira Moraes", 1235);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Brenda Marques"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNomeContato("Matheus Teixeira Moraes", 121212));
    }
}
