# Fila e Pilha em Java Collections

Este documento fornece uma visão geral sobre o uso de Fila (Queue) e Pilha (Stack) na biblioteca de coleções do Java.

## Fila (Queue)

Uma fila é uma estrutura de dados que segue o princípio FIFO (First In, First Out). Em Java, a interface `Queue` é usada para representar uma fila.

### Exemplo de Uso

```java
import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Adiciona elementos na fila
        fila.add("Elemento 1");
        fila.add("Elemento 2");
        fila.add("Elemento 3");

        // Remove e imprime o primeiro elemento da fila
        System.out.println(fila.poll());

        // Imprime o próximo elemento da fila sem removê-lo
        System.out.println(fila.peek());
    }
}
```

## Pilha (Stack)

Uma pilha é uma estrutura de dados que segue o princípio LIFO (Last In, First Out). Em Java, a classe `Stack` é usada para representar uma pilha.

### Exemplo de Uso

```java
import java.util.Stack;

public class PilhaExemplo {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        // Adiciona elementos na pilha
        pilha.push("Elemento 1");
        pilha.push("Elemento 2");
        pilha.push("Elemento 3");

        // Remove e imprime o último elemento adicionado na pilha
        System.out.println(pilha.pop());

        // Imprime o próximo elemento da pilha sem removê-lo
        System.out.println(pilha.peek());
    }
}
```

## Conclusão

As filas e pilhas são estruturas de dados fundamentais que podem ser facilmente manipuladas usando as classes e interfaces fornecidas pela biblioteca de coleções do Java. A fila segue o princípio FIFO, enquanto a pilha segue o princípio LIFO, cada uma adequada para diferentes tipos de problemas e algoritmos.
