public class main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();

        manager.setName("Brenda Ferreira Marques");
        employee.setName("Matheus Teixeira Moraes");

        System.out.println(manager.getName());
    }
}
