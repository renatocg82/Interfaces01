package entities;

public final class Cachorro extends Mamifero{

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
	
}
