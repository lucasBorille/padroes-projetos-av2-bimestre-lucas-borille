package questao2;

import java.math.BigDecimal;

public interface PerfilCobranca {
    String getNome();

    BigDecimal calcular(int minutosPermanencia);
}
