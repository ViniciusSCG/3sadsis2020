package unicesumar.segundoBimestre;

public class Time {
	private Torcedor torcedor;
	private String nome;
	
	public Time(String nome){
		this.nome = nome;
	}

	public Torcedor getTorcedor() {
		return torcedor;
	}

	public void setTorcedor(Torcedor torcedor) {
		this.torcedor = torcedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	
}
