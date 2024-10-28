package variaveis;
import java.util.Scanner;

public class EntradaSaida {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade;
        String nome;
        
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();

        System.out.println("Digite seu nome: ");
        ler.skip("\\R?");
        nome = ler.nextLine();

        System.out.println("Sua idade é: " + idade + " e seu nome é: " + nome);
    }
}
