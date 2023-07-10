package entities;

public final class Gato extends Mamifero{

	
	protected String raça;
	
	public Gato() {		
	}
	
	
	
	public Gato(String raça) {
		this.raça = raça;
	}


	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}



	@Override
	public void amamentar() {
		
	}

	@Override
	public void emitirSom() {
		
	}
	
	

}
