package domain.enums;

public enum TipoMovimentacaoEnum {

    SAIDA("Credito em conta","C"), 
    ENTRADA("Debito em conta","D"),
    TRANSFERENCIA("Transferencia","T");

    private String descricao;
    private String tipo;

    TipoMovimentacaoEnum(String descricao, String tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    
}
