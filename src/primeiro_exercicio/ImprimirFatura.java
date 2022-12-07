package primeiro_exercicio;

public class ImprimirFatura {

     private Fatura fatura;

    public ImprimirFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public void imprimirFatura() {
            System.out.println(fatura.getQuantidade() + "x " + fatura.getLivro().getNome() + "R$" + fatura.getLivro().getPreco());
            System.out.println("Porcentagem de desconto: " + fatura.getPorcDesconto());
            System.out.println("Procentagem de imposto: " + fatura.getTotal());
            System.out.println("Total: " + fatura.getTotal());

    }
}
