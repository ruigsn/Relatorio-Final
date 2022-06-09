package Calculadora;

import java.util.Scanner;

public class Gorjeta {
    
    public void calcGorjeta() {
        
            Scanner conta = new Scanner(System.in);
            System.out.println("Digite o valor da conta: ");
            double valorConta = conta.nextDouble();
            conta.close();

            Scanner pessoas = new Scanner(System.in);
            System.out.println("Digite o número de pessoas: ");
            double numPessoas = pessoas.nextInt();
            pessoas.close();

            Scanner percent = new Scanner(System.in);
            System.out.println("Digite o percentual da gorjeta: ");
            double percentGorjeta = percent.nextInt();
            percent.close();

            calculadora c = new calculadora();
            double valorFinal = c.multiplicacao(valorConta, percentGorjeta)/100;
            double valPorPessoa = c.divisao(valorFinal, numPessoas);
            
            System.out.println("O valor total da conta é: " + valorFinal);
            System.out.println("O valor a ser pago por cada pessoa é: " + valPorPessoa);
        }

    }
