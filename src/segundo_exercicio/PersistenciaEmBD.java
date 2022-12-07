package segundo_exercicio;

public class PersistenciaEmBD implements PersistenciaDaFatura {

  private Fatura fatura;

    public PersistenciaEmBD(Fatura fatura) {
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
        System.out.println("Salvar a fatura no Banco de dados...\n");
        this.fatura.imprimirFatura();

    }
}

