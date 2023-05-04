package domain;

import java.util.List;
import java.util.ArrayList;

public class Conta {

    private String titular;
    private double saldo;
    private String agencia;
    private String conta;
    private String dac;
    private String tipoConta;
    private List<Movimentacao> movimentacao;

    public Conta(String titular, String agencia, String conta, String dac, String tipoConta) {
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        this.dac = dac;
        this.tipoConta = tipoConta;
        this.movimentacao = new ArrayList<>();
    }
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo=saldo;
    }
    public String getAgencia() {
        return agencia;
    }
    public String getConta() {
        return conta;
    }
    public String getDac() {
        return dac;
    }
    public String getTipoConta() {
        return tipoConta;
    } 
    public List<Movimentacao> getMovimentacao() {
        return movimentacao;
    }

    @Override
    public String toString() {
        return "Conta{" + "titular=" + titular +
         ", saldo=" + saldo + ", agencia=" + agencia + ", conta=" + 
         conta + ", dac=" + dac + ", tipoConta=" + tipoConta + '}';
    }
    
}
