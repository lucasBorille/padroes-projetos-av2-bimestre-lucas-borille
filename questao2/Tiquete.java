package questao2;

import java.math.BigDecimal;

public class Tiquete {
    private final String placa;
    private final int minutosPermanencia;
    private PerfilCobranca perfil;

    public Tiquete(String placa, int minutosPermanencia, PerfilCobranca perfil) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Placa é obrigatoria");
        }
        if (minutosPermanencia < 0) {
            throw new IllegalArgumentException("Tempo de permanencia não pode ser negativo");
        }
        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
        setPerfil(perfil);
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutosPermanencia() {
        return minutosPermanencia;
    }

    public PerfilCobranca getPerfil() {
        return perfil;
    }

    public final void setPerfil(PerfilCobranca perfil) {
        if (perfil == null) {
            throw new IllegalArgumentException("Perfil de cobrança é obrigatório");
        }
        this.perfil = perfil;
    }

    public BigDecimal valorAPagar() {
        return perfil.calcular(minutosPermanencia);
    }
}
