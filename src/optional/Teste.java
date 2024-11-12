package optional;

import java.util.Optional;

public class Teste {
    public static void main(String[] args) {
        // Criando um objeto Cliente com nome nulo
        Cliente cliente = new Cliente(null);

        // Criando um Optional com o objeto Cliente
        Optional<Cliente> clienteOptional = Optional.ofNullable(cliente);

        // Obtendo o nome do cliente
        String nome = clienteOptional.map(resposta -> resposta.getNome()).orElse("Desconhecido");

        // Imprimindo o nome
        System.out.println(nome);

        // Setando um nome para o cliente
        cliente.setNome("João");

        // Obtendo o nome do cliente
        nome = clienteOptional.map(resposta -> resposta.getNome()).orElse("Desconhecido");

        // Imprimindo o nome
        System.out.println(nome);
    }
}