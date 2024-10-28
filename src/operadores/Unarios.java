package operadores;

public class Unarios {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;

        x = y--;
        y = --x;

        System.out.println("O valor de x é: " + x);
        System.out.println("O valor de y é: " + y);

        

    }

}
