package questao2;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int minutos = 135;
        List<PerfilCobranca> perfis = List.of(
                new PerfilRotativo(),
                new PerfilMensalista(),
                new PerfilConveniado());

        System.out.println("Permanencia: " + minutos + " minutos");
        for (PerfilCobranca perfil : perfis) {
            Tiquete tiquete = new Tiquete("ABC-1234", minutos, perfil);
            System.out.println(perfil.getNome() + ": " + formatar(tiquete.valorAPagar()));
        }

        System.out.println();
        Tiquete tiquete = new Tiquete("XYZ-9876", minutos, new PerfilRotativo());
        imprimir(tiquete);

        tiquete.setPerfil(new PerfilConveniado());
        imprimir(tiquete);

        tiquete.setPerfil(new PerfilMensalista());
        imprimir(tiquete);
    }

    private static void imprimir(Tiquete tiquete) {
        System.out.println("Tíquete " + tiquete.getPlaca() + "  perfil=" + tiquete.getPerfil().getNome()
                + "  valor=" + formatar(tiquete.valorAPagar()));
    }

    private static String formatar(BigDecimal valor) {
        return String.format(Locale.forLanguageTag("pt-BR"), "R$ %.2f", valor);
    }
}
