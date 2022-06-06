package Calculadora;

import java.util.Scanner;

public class MediaProva {

    public void mediaProva() {

        Scanner notas = new Scanner(System.in);
        System.out.println("Digite a primeria nota");
        double nota1 = notas.nextInt();
        System.out.println("Digite a segunda nota");
        double nota2 = notas.nextInt();

        calculadora c = new calculadora();
        double soma = c.soma(nota1, nota2);
        double resultado;
        resultado = c.divisao(soma, 2);
        System.out.println("resultado é: " + resultado);

    }

}