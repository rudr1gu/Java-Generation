package vetores;

import java.util.Arrays;

public class VetorEx03 {
    public static void main(String[] args) {
        
        String[] grupoA = {"João", "Maria", "José", "Pedro", "Paulo"};
        String[] grupoB = {"Maria", "José", "Paulo", "Ana", "Carlos"};

        System.out.println("");
        System.out.println("Os Arrays são iguais? ");

        if(Arrays.equals(grupoA, grupoB)){
            System.out.println("Sim, são iguais");
        } else {
            System.out.println("Não, são diferentes");
        }
    }
}