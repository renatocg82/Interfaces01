package entities;

public final class Gato extends Mamifero implements AnimalEstimacao, AnimalDomesticado {

	
	protected String ra�a;
	
	public Gato() {		
	}
	
	public Gato(String ra�a) {
		this.ra�a = ra�a;
	}


	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
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
