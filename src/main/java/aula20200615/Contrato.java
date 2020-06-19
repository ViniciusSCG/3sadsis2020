package aula20200615;

import java.util.ArrayList;

public class Contrato {
	private Aluno aluno;
	private ArrayList<Fiador> fiador;
	private boolean regular;
	
	public Contrato(Aluno aluno, ArrayList<Fiador> fiador, boolean regular) {
		this.aluno = aluno;
		this.fiador = fiador;
		this.regular = regular;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public ArrayList<Fiador> getFiador() {
		return fiador;
	}

	public void setFiador(ArrayList<Fiador> fiador) {
		this.fiador = fiador;
	}

	public boolean isRegular() {
		return regular;
	}

	public void setRegular(boolean regular) {
		this.regular = regular;
	}
	
	
}
