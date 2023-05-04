package domain;
import java.util.Date;

import domain.enums.TipoMovimentacaoEnum;


public class Movimentacao {

    private Date dataMovimentacao;
    private String descricao;
    private TipoMovimentacaoEnum tipoMovimentacao;

    public Movimentacao(String descricao, TipoMovimentacaoEnum tipoMovimentacao) {
        this.dataMovimentacao = new Date();
        this.descricao = descricao;
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Date getDataMovimentacao() {
        return dataMovimentacao;
    }
    public void setDataMovimentacao(Date dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public TipoMovimentacaoEnum getTipoMovimentacao() {
        return tipoMovimentacao;
    }
    public void setTipoMovimentacao(TipoMovimentacaoEnum tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    @Override
    public String toString() {
        return "Movimentacao{" + "dataMovimentacao=" + dataMovimentacao + ", descricao=" + descricao + ", tipoMovimentacao=" + tipoMovimentacao + '}';
    }
    
}
