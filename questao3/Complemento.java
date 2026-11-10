package questao3;

import java.math.BigDecimal;

public abstract class Complemento implements Bebida {
    private final Bebida bebida;
    private final String nome;
    private final BigDecimal preco;

    protected Complemento(Bebida bebida, String nome, BigDecimal preco) {
        if (bebida == null) {
            throw new IllegalArgumentException("Bebida é obrigatoria");
        }
        this.bebida = bebida;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + " + nome;
    }

    @Override
    public BigDecimal getPreco() {
        return bebida.getPreco().add(preco);
    }
}
