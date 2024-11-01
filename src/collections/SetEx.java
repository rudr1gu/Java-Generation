package collections;

import java.util.HashSet;

public class SetEx {
    public static void main(String[] args) {

        HashSet<String> setFrutas = new HashSet<String>();

        setFrutas.add("Banana");
        setFrutas.add("Maçã");
        setFrutas.add("Pera");
        setFrutas.add("Uva");
        setFrutas.add("Melancia");
        setFrutas.add("Melancia");

        System.out.println("Frutas Cadastradas: ");
        setFrutas.forEach(fruta -> {
            System.out.println(fruta);
        });

        System.out.println("\nTamanho do Set: " + setFrutas.size());

        System.out.println("\nVerifique se uma fruta esta no Set? " + setFrutas.contains("Banana"));

        //Retorna Organiza por odem alfabética
        System.out.println("\nFrutas Cadastradas: ");
        
        setFrutas.stream().sorted().forEach(fruta -> {
            System.out.println(fruta);
        });
        
    }
}