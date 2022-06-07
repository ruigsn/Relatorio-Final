package Calculadora;

public class calculadora {

    public double soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        return resultado;
    }

    public double subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        return resultado;
    }

    public double multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
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

    public double piso(double numero1) {
        double resultado = Math.floor(numero1);
        return resultado;
    }

    public double teto(double numero1) {
        double resultado = Math.ceil(numero1);
        return resultado;
    }
}
