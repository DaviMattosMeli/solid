package segundo_exercicio;

public class TestaLivro {

    public static void main(String[] args) {

        Livro l1 = new Livro("Principe Kalibam", "JK", 2007, 159.99, "46546545645");

        Fatura f1 = new Fatura(l1,1,0.1,0.2);

        ImpressaoDeFatura imp = new ImpressaoDeFatura(f1);

        PersistenciaEmArquivo persistenciaEmArquivo = new PersistenciaEmArquivo(f1);

        PersistenciaEmBD persistenciaEmBD = new PersistenciaEmBD(f1);

        persistenciaEmBD.salvar(f1);

        persistenciaEmArquivo.salvar(f1);

        imp.imprimir();
    }

}
