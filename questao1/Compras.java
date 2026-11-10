package questao1;

public class Compras implements ObservadorEstoque {
    private static final int LIMITE_ESTOQUE_BAIXO = 5;

    @Override
    public void atualizar(String produto, int quantidade) {
        if (quantidade < LIMITE_ESTOQUE_BAIXO) {
            System.out.println("compras alerta: estoque baixo de " + produto + " (" + quantidade + " )");
        }
    }
}
