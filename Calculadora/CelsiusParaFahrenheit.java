package Calculadora;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

    private double multiplicacao;
    private double resultado;

    public void celsiusParaFahrenheit() {

        try (Scanner temperatura = new Scanner(System.in)) {
            System.out.println("Entre com a temperatura Celsius");
            double celsius = temperatura.nextDouble();

            calculadora c = new calculadora();
            double resultado1 = celsius * 1.8;
            multiplicacao = resultado1;
            resultado = c.soma(multiplicacao, 32);

            System.out.println("A conversão de: " + celsius + " Celsius para Fahrenheit é :  " + resultado + "Fahrenheit");
        }

        // (0 °C × 9/5) + 32 = 32 °F

    }
}