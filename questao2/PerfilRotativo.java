package questao2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PerfilRotativo implements PerfilCobranca {
    private static final BigDecimal VALOR_HORA = new BigDecimal("8.00");
    private static final int MINUTOS_POR_HORA = 60;

    @Override
    public String getNome() {
        return "ROTATIVO";
    }

    @Override
    public BigDecimal calcular(int minutosPermanencia) {
        int horasIniciadas = (minutosPermanencia + MINUTOS_POR_HORA - 1) / MINUTOS_POR_HORA;
        return VALOR_HORA.multiply(BigDecimal.valueOf(horasIniciadas)).setScale(2, RoundingMode.HALF_UP);
    }
}
