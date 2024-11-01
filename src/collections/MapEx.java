package collections;

import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        System.out.println("Map");

        // criar um map com chave string e valor double
        HashMap<Long, String> pessoa = new HashMap<Long, String>();

        pessoa.put(3333333733l, "João");
        pessoa.put(4444443334l, "Maria");
        pessoa.put(5555553335l, "José");
        pessoa.put(6666663336l, "Ana");
        pessoa.put(7777773337l, "Carlos");
        pessoa.put(8888883338l, "Pedro");
        pessoa.put(9999993339l, "Paula");

        System.out.println("Pessoas Cadastradas: ");
        pessoa.forEach((cpf, nome) -> {
            System.out.println("Nome: " + nome + " CPF: " + cpf);
        });

        System.out.println("\nTamanho do Map: " + pessoa.size());
        

    }
    
}
