package stream;

import java.util.Arrays;
import java.util.List;
// import java.util.stream.Collectors;

public class Exemplo01 {
    public static void main(String[] args) {
       List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 

        // Filtrando os números pares
        numeros.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

        // Somando os números pares
        int somaPar = numeros.stream().filter(num -> num % 2 == 0).mapToInt(num -> num).sum();

        System.out.println("Soma dos números pares: " + somaPar);

        System.out.println("Números pares:");
        System.out.println(numeros);
    }
}
