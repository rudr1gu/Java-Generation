package looping;

import java.util.Scanner;

import looping.models.Calculadora;

public class While {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
		boolean continua;
		
		System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
		System.out.print("\nDeseja usar nossa calculadora? (s/n): ");
        continua = scanner.next().equalsIgnoreCase("s");
		System.out.println("++++++++++++++++++++++++++++++++++");

        while (continua) {
            

            System.out.print("Digite o primeiro número: ");
            float num1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            float num2 = scanner.nextInt();

            System.out.println("\nEscolha a operação desejada: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();
            
            Calculadora calculadora = new Calculadora(num1, num2);

            switch (opcao) {
                case 1:
                    System.out.println("O resultado da soma é: " + calculadora.soma());
                    break;
                case 2:
                    System.out.println("O resultado da subtração é: " + calculadora.subtracao());
                    break;
                case 3:
                    System.out.println("O resultado da multiplicação é: " + calculadora.multiplicacao());
                    break;
                case 4:
                    System.out.println("O resultado da divisão é: " + calculadora.divisao());
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.print("\nDeseja continuar? (s/n): ");
            continua = scanner.next().equalsIgnoreCase("s");    
        }

        System.out.println("Até mais!");

        scanner.close();
    }
}
