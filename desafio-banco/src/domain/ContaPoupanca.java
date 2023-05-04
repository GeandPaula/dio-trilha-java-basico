package domain;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, String agencia, String conta, String dac, String tipoConta) {
        super(titular, agencia, conta, dac, tipoConta);
    }

    private BigDecimal rendimento;

    public BigDecimal getRendimento() {
        return rendimento;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPoupanca{" + "rendimento=" + rendimento + '}';
    }

}
