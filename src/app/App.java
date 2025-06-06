package app;

import entities.Conta;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Digite o nome do títular da conta: ");
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.print("Deseja fazer um depósito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's'){
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        }
        else {
            conta = new Conta(numero, titular);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor que deseja sacar: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);

        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        sc.close();
    }
}
