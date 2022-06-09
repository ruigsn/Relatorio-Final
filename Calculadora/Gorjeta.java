package Calculadora;

import java.util.Scanner;

public class Gorjeta {
    
    public void calcGorjeta() {
        
            Scanner conta = new Scanner(System.in);
            System.out.println("Digite o valor da conta: ");
            double valorConta = conta.nextDouble();

            Scanner pessoas = new Scanner(System.in);
            System.out.println("Digite o número de pessoas: ");
            double numPessoas = pessoas.nextInt();

            Scanner percent = new Scanner(System.in);
            System.out.println("Digite o percentual da gorjeta: ");
            double percentGorjeta = percent.nextInt();

            calculadora c = new calculadora();
            double valorParteGorjeta = c.multiplicacao(valorConta, percentGorjeta)/100;
            double valorFinal = c.soma(valorConta, valorParteGorjeta);
            double valPorPessoa = c.divisao(valorFinal, numPessoas);
            
            System.out.println("O valor total da conta é: " + valorFinal);
            System.out.println("O valor a ser pago por cada pessoa é: " + valPorPessoa);

            conta.close();
            pessoas.close();
            percent.close();

        }
        
    }
