package app;

public class Cliente {
    private String nome;
    private double saldo;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }
}