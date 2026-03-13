package exercicio_cadastro de peso;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Luccas");
        funcionario.setIdade(30);
        funcionario.setCargo("Gerente");

        Cliente Cliente = new Cliente();
        Cliente.setNome("Gabriel");
        Cliente.setIdade(25);
        Cliente.setEmail("biel237@email.com");

        System.out.println("Funcionario:");
        funcionario.exibirDados();

        System.out.println();

        System.out.println("Cliente:");
        Cliente.exibirDados();
    }
}
