package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListeEx {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        // criar uma array list com double notas

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<Double>();

        System.out.println("Digite a pimeira nota: ");

        notas.add(scanner.nextDouble());

        notas.add(7.5);
        notas.add(5.5);
        notas.add(8.5);
        
        System.out.println("\n Notas Cadastradas: ");

        // for (Double nota : notas) {
        //     System.out.println(nota);
        // }

        notas.forEach(nota -> {
            System.out.println(nota);
        });

        System.out.println("\nTamanho da lista: " + notas.size());

        System.out.println("\nNota na posição 2: " + notas.get(2));

        System.out.println("\nVerifique se uma nota esta na lista? " + notas.contains(scanner.nextDouble()));

        System.out.println("\nÍndice da nota 7.5: " + notas.indexOf(7.5));

        // System.out.println("\n Removendo a nota na posição 2: " + notas.remove(2));

        scanner.close();
    }
}