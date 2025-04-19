public class Main {
    public static void main(String[] args) {

//Utilizando a função print a partir de uma nova instancia para um Vendedor e um Gerente, respectivamente.
        printEmployee(new Salesman());
        printEmployee(new Manager());

        
        
    }

    public static void printEmployee(Employee employee){
//Realizando o casting para que o tipo de variável seja alterado de "Employee" para "Manager" ou "Salesman". 

        if (employee instanceof Manager){

            
            ((Manager)employee).setName("Brenda Ferreira Marques");
            System.out.println(employee.getName());

        }

        if (employee instanceof Salesman){

            ((Salesman)employee).setName("Matheus Teixeira Moraes");
            System.out.println(employee.getName());

        }

        
    }
    
}
