package Calculadora;

public class calculadora {

    public double soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        return resultado;
    }

    public double sub(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        return resultado;
    }

    public double divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        return resultado;
    }

    public double exponencial(double numero1, double numero2) {
        double resultado = Math.pow(numero1, numero2);
        return resultado;
    }

    public double raizQuadrada(double numero1) { 
        double resultado = Math.sqrt(numero1);
        return resultado;
    }

    public void piso() {

    }

    public void teto() {

    }
}
