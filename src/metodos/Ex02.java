package metodos;

public class Ex02 {

    public static void main(String[] args) {
    
        mensagem();
        somarNumeros(10, 20);

        //a principal diferença entre metodos void e metodos que retornam valores
        //é que os metodos void não retornam valores, apenas executam um bloco de codigo
        //enquanto os metodos que retornam valores retornam um valor que pode ser utilizado
        
    }

    public static void mensagem() {
        System.out.println("Metodo estatico mensagem:");
        System.out.println("Ola, mundo!");
    }

    public static void somarNumeros(int a, int b) {
        System.out.println("Metodo estatico somarNumeros:");
        System.out.println("Resultado: " + (a + b));
    }
}