package operadores;

import java.util.Scanner;

public class Aritimeticos {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner ler = new Scanner(System.in);
        int x, y, a, resultado;

        System.out.println("Digite o primeiro valor : ");
        x = ler.nextInt();

        System.out.println("Digite o segundo valor : ");
        y = ler.nextInt();

        System.out.println("Digite o valor para multiplicar: ");
        a = ler.nextInt();

        resultado = a * (x + y);
        System.out.println("A soma dos valores é: " + resultado);
    }

}
