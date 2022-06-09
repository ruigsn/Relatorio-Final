package Calculadora;

import java.util.Scanner;

public class Fatorial {

    int resultadoFinal;
    int resultado;

    public void CalcFatorial() {

        Scanner n = new Scanner(System.in);

        System.out.println("Digite o numero para calcular o Fatorial");
        int num = n.nextInt();
        resultado = num;
        for (int i = num - 1; i != 0; i--) {

            resultado = resultado * i;
            resultadoFinal = resultado;
        }
        System.out.println("O resultado do Fatorial é: " + resultadoFinal);
    }
}