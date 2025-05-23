import Models.Person;

public class Main {
    public static void main(String[] args) {
        
        Person male = new Person("Matheus Moraes");

        male.setAge(20);

        System.out.println("Pessoa Cadastrada:");
        System.out.println("Nome: "+ male.getName());
        System.out.println("Idade: "+ male.getAge());

    }
}
