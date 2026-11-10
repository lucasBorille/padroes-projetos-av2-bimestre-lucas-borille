package questao3;

import java.math.BigDecimal;

public class Chantilly extends Complemento {
    private static final String NOME = "Chantily";
    private static final BigDecimal PRECO = new BigDecimal("3.00");

    public Chantilly(Bebida bebida) {
        super(bebida, NOME, PRECO);
    }
}
