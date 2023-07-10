package entities;

public final class Cachorro extends Mamifero{

	protected int tamanho;
	protected String raça;
	
	public Cachorro() {
		
	}
	
	
	public Cachorro(int tamanho, String raça) {
		this.tamanho = tamanho;
		this.raça = raça;
	}


	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
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
