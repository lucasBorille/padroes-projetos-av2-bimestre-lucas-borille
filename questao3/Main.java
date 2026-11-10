package questao3;

import java.math.BigDecimal;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Bebida pedido1 = new Chantilly(new Leite(new Espresso()));
        Bebida pedido2 = new Calda(new Cha());
        Bebida pedido3 = new Leite(new Leite(new Chantilly(new Espresso())));
        Bebida pedido4 = new Cha();

        imprimir(1, pedido1);
        imprimir(2, pedido2);
        imprimir(3, pedido3);
        imprimir(4, pedido4);
    }

    private static void imprimir(int numero, Bebida pedido) {
        System.out.println("Pedido " + numero + ": " + pedido.getDescricao() + " = " + formatar(pedido.getPreco()));
    }

    private static String formatar(BigDecimal valor) {
        return String.format(Locale.forLanguageTag("pt-BR"), "R$ %.2f", valor);
    }
}
