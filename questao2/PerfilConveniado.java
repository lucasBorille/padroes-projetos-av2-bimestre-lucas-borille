package questao2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PerfilConveniado implements PerfilCobranca {
    private static final int MINUTOS_GRATUITOS = 30;
    private static final int MINUTOS_POR_HORA = 60;
    private static final BigDecimal VALOR_HORA = new BigDecimal("8.00");
    private static final BigDecimal DESCONTO = new BigDecimal("0.30");

    @Override
    public String getNome() {
        return "CONVENIADO";
    }

    @Override
    public BigDecimal calcular(int minutosPermanencia) {
        int minutosCobrados = Math.max(0, minutosPermanencia - MINUTOS_GRATUITOS);
        int horasIniciadas = (minutosCobrados + MINUTOS_POR_HORA - 1) / MINUTOS_POR_HORA;
        BigDecimal valorHoraComDesconto = VALOR_HORA.multiply(BigDecimal.ONE.subtract(DESCONTO));
        return valorHoraComDesconto.multiply(BigDecimal.valueOf(horasIniciadas)).setScale(2, RoundingMode.HALF_UP);
    }
}
