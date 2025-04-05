import Models.Person;

public class main {
    public static void main(String[] args) {
        
        Person male = new Person();

        male.setName("Matheus Moraes");
        male.setAge(20);

        System.out.println("Pessoa Cadastrada:");
        System.out.println("Nome: "+ male.getName());
        System.out.println("Idade: "+ male.getAge());

    }
}
