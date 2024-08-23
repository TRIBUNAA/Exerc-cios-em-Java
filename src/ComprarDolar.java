import java.util.Scanner;

public class ComprarDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em reais: ");
        double valorReal = scanner.nextDouble();

        System.out.println("Digite o valor em reais: ");
        double cotaçaoDolar = scanner.nextDouble();

        Moeda moeda = new Moeda(valorReal,
                cotaçaoDolar);
        moeda.calcularConversao();

        System.out.println("Você pode comprar"
                + moeda.getQuantidadeDolar() + "dólares.");


    }
}



