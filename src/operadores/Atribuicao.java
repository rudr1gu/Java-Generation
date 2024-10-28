package operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;

        x += y; // x = x + y
        y -= x; // y = y - x

        System.out.println("O valor de x é: " + x);
        System.out.println("O valor de y é: " + y);

    }
}
