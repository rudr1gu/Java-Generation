package collections2;

import java.util.Collections;
// import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        System.out.println("Pilha");

        Stack<String> pilha = new Stack<String>();

        pilha.push("Prato verde");
        pilha.push("Prato amarelo");
        pilha.push("Prato azul");
        pilha.push("Prato vermelho");

        System.out.println("Pratos na pilha: ");
       
        Iterator<String> it = pilha.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //reverter a ordem da pilha
        Collections.reverse(pilha);

        System.out.println("\nPratos na pilha invertida: ");
        it = pilha.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    

    }
}