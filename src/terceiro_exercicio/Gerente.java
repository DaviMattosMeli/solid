package terceiro_exercicio;

class Gerente extends Funcionario {
    
	private float bonus;
    
    public Gerente(float salario, String cargo, String nome, float bonus) {
		super(salario, cargo, nome);
		this.bonus = bonus;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
    
	/*public float CalcularSalarioGerente(){
        return this.getSalario() + bonus;
    }*/
	@Override
	public float calcularSalario() {
	   return this.getSalario() + bonus;
	}
}
