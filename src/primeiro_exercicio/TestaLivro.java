package primeiro_exercicio;

public class TestaLivro {

    public static void main(String[] args) {


        Livro livro = new Livro("Harry Potter", "JK", 2009,119.99,"4555645645");

        Fatura fatura = new Fatura(livro,2,0.20,20);

        ImprimirFatura imprimir  = new ImprimirFatura(fatura);

        imprimir.imprimirFatura();
    }
}
