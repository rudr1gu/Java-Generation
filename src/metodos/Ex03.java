package metodos;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        String classificacao;
        int idade = scanner.nextInt();

        classificacao = classificarIdade(idade);

        System.out.println("Classificação: " + classificacao);

        scanner.close();


    }

    public static String classificarIdade(int idade) {
        if(idade < 0 || idade > 120){
            return "Idade inválida";
        }else if(idade < 13) {
            return "Criança";
        } else if (idade < 18) {
            return "Adolescente";
        } else if (idade < 65) {
            return "Adulto";
        } else{
            return "Idoso";
        }
    }

}
