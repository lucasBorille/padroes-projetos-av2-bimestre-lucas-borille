package questao3;

import java.math.BigDecimal;

public class Leite extends Complemento {
    private static final String NOME = "Leite";
    private static final BigDecimal PRECO = new BigDecimal("2.00");

    public Leite(Bebida bebida) {
        super(bebida, NOME, PRECO);
    }
}
