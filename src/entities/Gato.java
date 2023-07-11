package entities;

public final class Gato extends Mamifero implements AnimalEstimacao, AnimalDomesticado {

	
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

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}
	
	

}
