package questao1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Auditoria implements ObservadorEstoque {
    private final List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String produto, int quantidade) {
        String registro = "produto=" + produto + " quantidade=" + quantidade;
        registros.add(registro);
        System.out.println("auditoria " + registro);
    }

    public List<String> getRegistros() {
        return Collections.unmodifiableList(registros);
    }
}
