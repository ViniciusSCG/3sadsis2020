package aula20200615;

import java.util.ArrayList;

public class Curso {
	private String codigoCurso;
	private String descricao;
	
	private Coordenador coordenador;
	private ArrayList<Turma> turmas;
	
	public Curso(String codigoCurso, String descricao, Coordenador coordenador) {
		this.codigoCurso = codigoCurso;
		this.descricao = descricao;
		this.coordenador = coordenador;
	}
	
	public Curso(String codigoCurso, String descricao, Coordenador coordenador, ArrayList turmas) {
		this.codigoCurso = codigoCurso;
		this.descricao = descricao;
		this.coordenador = coordenador;
		this.turmas = turmas;
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}

	public ArrayList<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(ArrayList<Turma> turmas) {
		this.turmas = turmas;
	}
	
}
