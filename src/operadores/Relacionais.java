package operadores;

public class Relacionais {
    public static void main(String[] args) {
        
        int x = 10;
        int y = 8;
        boolean resposta;
        
        resposta = x > y;
        System.out.println("O valor de x é maior que y: " + resposta);

        resposta = x < y;
        System.out.println("O valor de x é menor que y: " + resposta);

        resposta = x >= y;
        System.out.println("O valor de x é maior ou igual a y: " + resposta);

        resposta = x <= y;
        System.out.println("O valor de x é menor ou igual a y: " + resposta);

        resposta = x == y;
        System.out.println("O valor de x é igual a y: " + resposta);

        resposta = x != y;
        System.out.println("O valor de x é diferente de y: " + resposta);
    }

}
