package segundo_exercicio;

public class PersistenciaEmArquivo implements PersistenciaDaFatura {

    private Fatura fatura;

    public PersistenciaEmArquivo(Fatura fatura) {
        this.fatura = fatura;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    @Override
    public void salvar(Fatura fatura) {
        System.out.println("Salvar a fatura em arquivo PDF...\n");
        this.fatura.imprimirFatura();

    }
}