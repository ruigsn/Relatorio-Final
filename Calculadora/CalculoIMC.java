package Calculadora;

import java.util.Scanner;

public class CalculoIMC {

    public void calcularIMC() {

        try (Scanner dadosIMC = new Scanner(System.in)) {
            System.out.println("Digite o seu peso");
            double peso = dadosIMC.nextDouble();
            System.out.println("Digite a sua altura");
            double altura = dadosIMC.nextDouble();

            calculadora c = new calculadora();
            double multiplicacao = c.multiplicacao(altura, altura);
            double resultado;
            resultado = c.divisao(peso, multiplicacao);
            System.out.println("resultado é: " + resultado);
        }
    }
}