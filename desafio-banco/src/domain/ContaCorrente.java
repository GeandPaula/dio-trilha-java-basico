package domain;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    public ContaCorrente(String titular, String agencia, String conta, String dac, String tipoConta) {
        super(titular, agencia, conta, dac, tipoConta);
    }
    private double limite;
    private BigDecimal juros;

    public double getLimite() {
        return limite;
    }
    public BigDecimal getJuros() {
        return juros;
    }
    @Override
    public String toString() {
        return super.toString() + "ContaCorrente{" + "limite=" + limite + ", juros=" + juros + '}';
    }

    
}
