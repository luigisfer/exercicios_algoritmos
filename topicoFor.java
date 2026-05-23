import java.util.Scanner;

public class topicoFor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n;
        double valorMin, maior, menor, soma = 0.0;

        System.out.println("Digite o número total de atendimentos: ");
        n = leitor.nextInt();

        System.out.println("Digite o tempo (min) da amostra 1");
        valorMin = leitor.nextDouble();
        menor = valorMin;
        maior = valorMin;
        soma += valorMin;

        for (int i = 2; i <= n; i++) {

            System.out.println("Digite o tempo(min) da amostra " + i);
            valorMin = leitor.nextDouble();

            if (valorMin > maior) {
                maior = valorMin;
            }

            if (valorMin < menor) {
                menor = valorMin;
            }

            soma += valorMin;

        }

        double media = soma / n;

        System.out.println("O valor da soma total é: " + soma);
        System.out.println("A média é: " + media);
        System.out.println("O valor maior é: " + maior);
        System.out.println("O valor menor é: " + menor);

        leitor.close();

    }
}
