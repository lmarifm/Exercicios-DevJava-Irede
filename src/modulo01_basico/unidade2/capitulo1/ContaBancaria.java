package modulo01_basico.unidade2.capitulo1;

public class ContaBancaria {

    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double x){
        if(x>0){
            this.saldo = this.saldo+x;
        }
    }

    public void sacar(double x){
        if(x>0 && x<=this.saldo){
            this.saldo = this.saldo - x;
        }
    }
}

//1. Crie uma classe ContaBancaria com os atributos privados numero, titular e saldo.
//Implemente getters e setters, garantindo que o saldo não possa ser alterado
//diretamente (não crie setSaldo). Em vez disso, crie os métodos depositar() e sacar() para
//modicar o saldo.