package Calculadora;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int op = 10;

        Scanner opcao = new Scanner(System.in);

        System.out.println("-----------------------------------------------------");
        System.out.println("Digite a opcão desejada");
        System.out.println("");
        System.out.println("Digite 1 - Para converter celsius em fahrenheit");
        System.out.println("Digite 2 - Para calculara a media de notas");
        System.out.println("Digite 3 - Para calcular a área da circunferencia");
        System.out.println("Digite 4 - Para calcular o lada de um quadrado");
        System.out.println("Digite 5 - Para calcular o aumento de salario");
        System.out.println("Digite 6 - Para calcular o IMC");
        System.out.println("Digite 7 - Para calcular o velocidade média");
        System.out.println("Digite 0 - EXIT");
        System.out.println("-----------------------------------------------------");
        op = opcao.nextInt();

        switch (op) {

            case 1:
                CelsiusParaFahrenheit convert = new CelsiusParaFahrenheit();
                convert.celsiusParaFahrenheit();
                break;
            case 2:
                MediaProva mediaProva = new MediaProva();
                mediaProva.mediaProva();
                break;
            case 3:
                AreaCircunferencia areaCirc = new AreaCircunferencia();
                areaCirc.areaCirc();
                break;
            case 4:
                LadoQuadrado ladoqua = new LadoQuadrado();
                ladoqua.lado();
                break;
            case 5:
                AumentoSalarial sal = new AumentoSalarial();
                sal.aumentar();
                break;

            case 6:
                CalculoIMC calc = new CalculoIMC();
                calc.calcularIMC();
                break;
            case 7:
                VelocidadeMedia media = new VelocidadeMedia();
                media.calculoVelocidadeMedia();
                break;
            case 0:
                break;

        }
        opcao.close();
    }
}