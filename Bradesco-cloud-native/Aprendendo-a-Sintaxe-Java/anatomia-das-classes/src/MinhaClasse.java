public class MinhaClasse{

    public static void main(String[] args) {
        
        System.out.println("Olá mundo");

        String primeiroNome = "Matheus";
        String segundoNome = "Moraes";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

            return primeiroNome.concat(" ").concat(segundoNome);

    }

}