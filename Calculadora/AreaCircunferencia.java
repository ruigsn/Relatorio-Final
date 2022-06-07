package Calculadora;

import java.util.Scanner;

public class AreaCircunferencia {

    public void areaCirc() {

        Scanner raioCirc = new Scanner(System.in);
        System.out.println("Digite o valor do raio da circunferência: ");
        double raio = raioCirc.nextDouble();

        calculadora c = new calculadora();
        double area = Math.PI * c.exponencial(raio, 2);
        System.out.println("A área da circunferência é: " + area);
    }
    
}
