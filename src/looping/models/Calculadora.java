package looping.models;

public class Calculadora {
    private float num1;
    private float num2;

    public Calculadora(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float soma() {
        return num1 + num2;
    }

    public float subtracao() {
        return num1 - num2;
    }

    public float multiplicacao() {
        return num1 * num2;
    }

    public float divisao() {
        return num1 / num2;
    }
}