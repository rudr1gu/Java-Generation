package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class VetorEx02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("");
        System.out.println("Digite 5 números inteiros: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º Número: ");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            int i = 0; 
            System.out.println((i + 1) + "º Número: " + numero);
        }

        Arrays.sort(numeros);
        System.out.println("Números Ordenados: " + Arrays.toString(numeros));

        scanner.close();
    }
}
