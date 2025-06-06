package entities;

import java.util.Objects;

public class Conta {

    private int numero;
    private String titular;
    private double saldo;

    public Conta(){
    }

    public Conta(int numero, String titular, double depositoInicial){
        this.numero = numero;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public Conta (int numero, String titular){
        this.numero = numero;
        this.titular = titular;
    }

    public String toString(){
        return "Conta "
                + numero
                + ", Títular: "
                + titular
                + ", Saldo: $ "
                + String.format("%.2f" , saldo);
    }

    public int getNumero(){
        return numero;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito (double valorDepositado){
        saldo += valorDepositado;
    }

    public void saque (double valorSacado){
            saldo -= valorSacado + 5.0;
    }


}
