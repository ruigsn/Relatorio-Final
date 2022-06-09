package Calculadora;

import java.util.Scanner;

public class VelocidadeMedia {

    double velocidadeMediaFinal;

    public void calculoVelocidadeMedia() {

        try (Scanner n = new Scanner(System.in)) {
            System.out.println("Digite a velocidade inicial");
            int vel1 = n.nextInt();
            System.out.println("Digite velocidade final");
            int vel2 = n.nextInt();

            calculadora c = new calculadora();
            double vMedia1 = c.soma(vel1, vel2);
            velocidadeMediaFinal = c.divisao(vMedia1, 2);

        }
        System.out.println("Velocidade media é:  " + velocidadeMediaFinal);
    }    
}