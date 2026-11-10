package questao2;

import java.math.BigDecimal;

public class PerfilMensalista implements PerfilCobranca {
    private static final BigDecimal VALOR_FIXO = new BigDecimal("250.00");

    @Override
    public String getNome() {
        return "MENSALISTA";
    }

    @Override
    public BigDecimal calcular(int minutosPermanencia) {
        return VALOR_FIXO;
    }
}
