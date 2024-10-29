package ifelse;

import java.util.Scanner;

public class SwitchCase {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma opção: ");
        System.out.println(" ######## MENU ######## ");
        System.out.println("1 - indicação de um filme");
        System.out.println("2 - Ler uma frase motivacional");
        System.out.println("3 - Indicação de uma musica");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite um genero de filme: ");
                String genero = scanner.next().toUpperCase();
                if (genero.equals("TERROR")) {
                    System.out.println("Filme: O Iluminado");
                } else if (genero.equals("COMEDIA")) {
                    System.out.println("Filme: Se beber não case");
                } else if (genero.equals("DRAMA")) {
                    System.out.println("Filme: A procura da felicidade");
                } else {
                    System.out.println("Genero não encontrado");
                }
                break;
            case 2:
                System.out.println("Frase: A persistência é o caminho do êxito.");
                break;
            case 3:
                System.out.println("Música: Aquarela - Toquinho");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
