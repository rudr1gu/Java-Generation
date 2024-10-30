package looping;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";
        boolean autenticado = false;

        do {
            System.out.print("Digite o usuário: ");
            String usuario = scanner.next();
            System.out.print("Digite a senha: ");
            String senha = scanner.next();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Seja bem vindo!");
            } else {
                System.out.println("Usuário ou senha inválidos!");
                System.out.print("Deseja tentar novamente? (s/n): ");
                String continuar = scanner.next().toUpperCase();

                if (continuar.equals("S")) {
                    autenticado = true;
                }else {
                    autenticado = false;
                }
            }
        } while (autenticado);

        scanner.close();
 
 
  
    }
}
