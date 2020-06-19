package aula20200615;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Curso ads = new Curso("1", "curso de programação", new Coordenador("Fulano", "Santos", "01/01/2001",
				"Rua bahia", "183", "bloco a", "jardim pitanga", "Maringá", "Pr"));
		
		Professor professor1 = new Professor("Bob", "Santos", "01/01/2001","Rua bahia", "183", "bloco a", "jardim pitanga", "Maringá", "Pr");
		
		Turma ads1s = new Turma("turma de ads", "1",professor1);
		
		Fiador fiador1 = new Fiador("Junior", "Santos", "01/01/2001","Rua bahia", "183", "bloco a", "jardim pitanga", "Maringá", "Pr");
		Fiador fiador2 = new Fiador("Cleyton", "Santos", "01/01/2001","Rua bahia", "183", "bloco a", "jardim pitanga", "Maringá", "Pr");
		
		Fiador fiador3 = new Fiador("James", "Santos", "01/01/2001","Rua bahia", "183", "bloco a", "jardim pitanga", "Maringá", "Pr");
		Fiador fiador4 = new Fiador("Carlos", "Santos", "01/01/2001","Rua bahia", "183", "bloco a", "jardim pitanga", "Maringá", "Pr");
		
		ArrayList<Fiador> fiadorPlinio = new ArrayList<Fiador>();
		ArrayList<Fiador> fiadorJose = new ArrayList<Fiador>();
		
		fiadorPlinio.add(fiador3);
		fiadorPlinio.add(fiador4);
		
		Contrato contratoAlunoPlinio = new Contrato(new Aluno ("Plinio", "Santos", "01/01/2001","Rua bahia", "183", "bloco a", "jardim pitanga", "Maringá", "Pr"), fiadorPlinio,true);
		Contrato contratoAlunoJose = new Contrato(new Aluno ("Jose", "Santos", "01/01/2001","Rua bahia", "183", "bloco a", "jardim pitanga", "Maringá", "Pr"), fiadorJose,true);
		
		Aluno alunoa1 = contratoAlunoPlinio.getAluno();
		ads1s.addLider(alunoa1);

	}

}
