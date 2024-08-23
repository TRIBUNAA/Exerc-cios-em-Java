import  java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o sobrenome do funcionário: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite as horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite as horas trabalhadas: ");
        float valorPorHora = scanner.nextFloat();

        Funcionario funcionario = new
                Funcionario(nome , sobrenome ,
                horasTrabalhadas, valorPorHora);

        System.out.println("nome completo: "
        + funcionario.nomeCompleto());
        System.out.println("Salario: "
        + funcionario.calcularSalario());

        funcionario.incrementarHoras(8);
        System.out.println("Salario após adicionar 8 horas: "
        + funcionario.calcularSalario());
    }
}
