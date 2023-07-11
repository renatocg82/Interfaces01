package entities;

public final class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

	protected int tamanho;
	protected String ra�a;
	
	public Cachorro() {
		
	}
	
	
	public Cachorro(int tamanho, String ra�a) {
		this.tamanho = tamanho;
		this.ra�a = ra�a;
	}


	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
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
	public void brincar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}
	
}
