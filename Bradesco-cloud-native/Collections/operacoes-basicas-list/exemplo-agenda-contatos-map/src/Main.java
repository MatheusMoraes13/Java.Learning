import models.*;

public class Main {
    public static void main(String[] args) throws Exception {
       AgendaContatos agendaContatos = new AgendaContatos();


        agendaContatos.adicionarContato("Matheus", 123456);
        agendaContatos.adicionarContato("Matheus", 5665);
        agendaContatos.adicionarContato("Matheus Teixeira", 11111111);
        agendaContatos.adicionarContato("Matheus DIO", 654987);
        agendaContatos.adicionarContato("Brenda Marques", 11111111);
        agendaContatos.adicionarContato("Matheus", 444444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Brenda Marques");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Matheus DIO"));
    }
}
