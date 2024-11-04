package collections2;

import java.util.Collections;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Queue<String> fila = new java.util.LinkedList<>();

        Collections.addAll(fila, "João", "Maria", "José", "Ana", "Carlos", "Pedro", "Paula");

        System.out.println("Pessoas Cadastradas: ");

        fila.forEach(pessoa -> {
            System.out.println("Nome: " + pessoa);
        });

        System.out.println("Adicionando um novo elemento na fila: ");
        System.out.print("Digite o nome: ");
        fila.add(scanner.nextLine());

        System.out.println("Pessoas Cadastradas: ");
        fila.forEach(pessoa -> {
            System.out.println("Nome: " + pessoa);
        });

        System.out.println("Exibindo o primeiro nome da fila: " + fila.peek());
        System.out.println("Exibindo o primeiro nome da fila e removendo: " + fila.poll());

        scanner.close();
    }
}
