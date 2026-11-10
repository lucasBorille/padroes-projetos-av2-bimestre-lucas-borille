package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        notebook.adicionarObservador(compras);
        notebook.adicionarObservador(vendas);
        notebook.adicionarObservador(auditoria);

        System.out.println("10 -> 7");
        notebook.alterarQuantidade(7);

        System.out.println("7 -> 7 (sem mudança, ninguem é avisado)");
        notebook.alterarQuantidade(7);

        System.out.println("7 -> 4");
        notebook.alterarQuantidade(4);

        System.out.println("4 -> 0");
        notebook.alterarQuantidade(0);

        System.out.println("0 -> 12");
        notebook.alterarQuantidade(12);

        System.out.println("Compras removidas");
        notebook.removerObservador(compras);

        System.out.println("12 -> 3 (Compras nao recebe mais)");
        notebook.alterarQuantidade(3);

        System.out.println("--- 3 -> 0");
        notebook.alterarQuantidade(0);

        System.out.println("--- 0 -> 20");
        notebook.alterarQuantidade(20);

        System.out.println();
        System.out.println("Registros da auditoria: " + auditoria.getRegistros().size());
        auditoria.getRegistros().forEach(System.out::println);
    }
}
