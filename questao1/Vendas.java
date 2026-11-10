package questao1;

import java.util.HashSet;
import java.util.Set;

public class Vendas implements ObservadorEstoque {
    private final Set<String> produtosZerados = new HashSet<>();

    @Override
    public void atualizar(String produto, int quantidade) {
        if (quantidade == 0) {
            produtosZerados.add(produto);
        } else if (produtosZerados.remove(produto)) {
            System.out.println("vendas alerta: " + produto + " voltou ao estoque (" + quantidade + " )");
        }
    }
}
