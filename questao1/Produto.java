package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private final String nome;
    private int quantidade;
    private final List<ObservadorEstoque> observadores = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do produto é obrigatorio");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade nao pode ser negativa");
        }
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarObservador(ObservadorEstoque observador) {
        if (observador == null) {
            throw new IllegalArgumentException("Observador nao pode ser nulo");
        }
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
        if (novaQuantidade == this.quantidade) {
            return;
        }
        this.quantidade = novaQuantidade;
        notificar();
    }

    private void notificar() {
        for (ObservadorEstoque observador : new ArrayList<>(observadores)) {
            observador.atualizar(nome, quantidade);
        }
    }
}
