package quinto_exercicio;

public class FrontendDev implements IDev{


	@Override
	public void dev() {
		this.react();
	}

	public void react(){
		System.out.println("Dev React");
	}
}
