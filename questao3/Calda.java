package questao3;

import java.math.BigDecimal;

public class Calda extends Complemento {
    private static final String NOME = "Calda";
    private static final BigDecimal PRECO = new BigDecimal("2.50");

    public Calda(Bebida bebida) {
        super(bebida, NOME, PRECO);
    }
}
