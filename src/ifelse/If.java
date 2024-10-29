package ifelse;

public class If {
    public static void main(String[] args) {
        int n1 = 4, n2 = 3, n3 = 4;

        if(n1 == n2) {
            System.out.println("n1 é igual a n2");
        }

        if (n1 == n3) {
            System.out.println("n1 é igual a n3");
        }

        if (n1 != n2) {
            System.out.println("n1 é diferente de n2");
        }

        if (n1 != n3) {
            System.out.println("n1 é diferente de n3");
        }
    }
}