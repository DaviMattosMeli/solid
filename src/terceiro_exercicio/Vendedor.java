package terceiro_exercicio;

class Vendedor extends Funcionario{
    
	private float comissao;
    
    public Vendedor(float salario, String cargo, String nome, float comissao) {
		super(salario, cargo, nome);
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public float calcularSalarioVendedor(){
        return this.getSalario() + comissao;
    }

	@Override
	public float calcularSalario() {
		return this.getSalario() + comissao;
	}
}