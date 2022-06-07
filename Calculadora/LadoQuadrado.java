package Calculadora;

import java.util.Scanner;

public class LadoQuadrado {

    private double area;
    private double lado;

    public void lado() {
        try (Scanner areas = new Scanner(System.in)) {
            System.out.println("Digite a área de um quadrado (em cm) para descobrir o valor de seu lado: ");
            area = areas.nextDouble();
            
            calculadora c = new calculadora();
            lado = c.raizQuadrada(area);
            System.out.println("O lado desse quadrado é: " + lado + "cm");
        }
    }
}
