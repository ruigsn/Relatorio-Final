package Calculadora;

import java.util.Scanner;

public class AumentoSalarial {
    private double salario;
    private int aumento;
    private double dinheiro;
    private double salarioNovo;

    public void aumentar() {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Você é dono de uma empresa e decidiu dar um aumento para o seu melhor colaborador.");

            System.out.println("Digite o salário dele:");
            salario = teclado.nextDouble();

            System.out.println("Digite o aumento (em porcentagem) que ele vai receber:");
            aumento = teclado.nextInt();

            calculadora c = new calculadora();
            dinheiro = (c.multiplicacao(salario, aumento)) / 100; // calculadora usada aqui
            salarioNovo = salario + dinheiro;

            System.out.println("O colaborador recebeu um aumento de R$" + dinheiro);
            System.out.println("e seu novo salário é R$" + salarioNovo);
        }
    }
}
