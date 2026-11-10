package questao3;

import java.math.BigDecimal;

public class Espresso implements Bebida {
    private static final BigDecimal PRECO = new BigDecimal("6.00");

    @Override
    public String getDescricao() {
        return "Espresso";
    }

    @Override
    public BigDecimal getPreco() {
        return PRECO;
    }
}
