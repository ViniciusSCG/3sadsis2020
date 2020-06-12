package unicesumar.segundoBimestre;

public class Torcedor {
	private Time time;
	private String nome;
	
	public Torcedor(Time time, String nome) {
		this.time = time;
		this.time.setTorcedor(this);
		this.nome = nome;
		
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
