package quinto_exercicio;

public class BackendDev implements IDev{
	@Override
	public void dev() {
		this.java();
	}

	public void java(){
		System.out.println("Dev Java");
	}
}
