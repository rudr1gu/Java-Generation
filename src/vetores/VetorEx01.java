package vetores;

public class VetorEx01 {
    public static void main(String[] args) {
        String[] dogs = {"Boxer", "Poodle", "Pitbull", "Pastor Alemão", "Dalmata"};

        System.out.println("");
        System.out.println("Lista de Raças de Cachorros:");

        for (int i = 0; i < dogs.length; i++) {
            System.out.println((i+1) +"º Posição: "+ dogs[i]);
        }
    }
}