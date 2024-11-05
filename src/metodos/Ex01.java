package metodos;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("Metodo estatico somar:");
        
        int resultado = somar(10, 20);

        System.out.println("Resultado: " + resultado);

    }

    public static int somar(int a, int b) {
        return a + b;
    }
}