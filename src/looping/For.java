package looping;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha onde a taboada começa: ");
        int tabuada = scanner.nextInt();

        System.out.println("escolha onde a taboada termina: ");
        int tabuada2 = scanner.nextInt();

        for (int i = tabuada; i <= tabuada2; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
       
        scanner.close();
    } 
}