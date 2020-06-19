package aula20200615;

import java.util.ArrayList;

public class Turma {
	private String descricao;
	private String codigo;
	private ArrayList<Aluno> alunos;
	private Aluno lider;
	private Professor professor;
	
	public Turma(String descricao, String codigo, Professor professor) {
		this.descricao = descricao;
		this.codigo = codigo;
		this.alunos = new ArrayList <Aluno>();
		this.professor = professor;
	}

	
	public void addAlunos(Contrato contrato){
		if(contrato.isRegular()) {
			this.alunos.add(contrato.getAluno());
		}
	}
	
	public void addLider(Aluno aluno) {
		this.lider = aluno;
	}
	
	
}
