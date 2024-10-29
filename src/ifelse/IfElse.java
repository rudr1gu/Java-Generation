package ifelse;

import java.util.Scanner;

public class IfElse {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        float[] notas = new float[4];
        float soma = 0;
        float media;

        System.out.println("Digite o nome do aluno: ");
        nome = scanner.nextLine();

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextFloat();
            soma += notas[i];
        }

        media = soma / 4;

        if (media >= 5) {
            System.out.printf("Sua media foi %.2f\n", media);
        } else {
            System.out.println("O aluno " + nome + " foi reprovado com média " + media);
        }
    }
}
