package variaveis;

public class VariaveisConstantes {
    public static void main(String[] args) {
        
        byte bit = 127; //O byte é um tipo de dado inteiro que ocupa 8 bits na memória. O byte é um tipo de dado inteiro que ocupa 8 bits na memória.
        short valor = 32767; //O short é um tipo de dado inteiro que ocupa 16 bits na memória.
        int quantidade = 2147483647; //O int é um tipo de dado inteiro que ocupa 32 bits na memória.
        long indentificador = 9223372036854775807L; //O long é um tipo de dado inteiro que ocupa 64 bits na memória.
        float altura = 25.5f; //O float é um tipo de dado que armazena números decimais de precisão simples, ele ocupa 32 bits na memória.
        double area = 45.4567; //O double é um tipo de dado que armazena números decimais de precisão dupla, ele ocupa 64 bits na memória.
        char tipo = 'F'; //O char é um tipo de dado que armazena um caractere, ele ocupa 16 bits na memória.
        boolean resposta = false; //O boolean é um tipo de dado que armazena valores lógicos, ele ocupa 1 bit na memória.

        final int QUANTIDADE = 1000; //A palavra reservada final é usada para declarar uma constante, ou seja, um valor que não pode ser alterado.

        String palavra = "Generation Brasil"; //O tipo de dado String é uma classe que representa uma sequência de caracteres.

        //Imprimindo as variáveis
        System.out.println("Valor do bit: " + bit);
        System.out.println("Valor do valor: " + valor);
        System.out.println("Valor da quantidade: " + quantidade);
        System.out.println("Valor do indentificador: " + indentificador);
        System.out.println("Valor da altura: " + altura);
        System.out.println("Valor da area: " + area);
        System.out.println("Valor do tipo: " + tipo);
        System.out.println("Valor da resposta: " + resposta);
        System.out.println("Valor da constante QUANTIDADE: " + QUANTIDADE);
        System.out.println("Valor da palavra: " + palavra);
        
    }
}