package unicesumar.segundoBimestre;

import java.util.ArrayList;

public class EmpresasContratando {
	private String nome;
	private ArrayList <Desempregados> desempregados = new ArrayList <>();

	
	public EmpresasContratando(String nome) {
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public ArrayList<Desempregados> getDesempregados() {
		return desempregados;
	}


	public void setDesempregados(ArrayList<Desempregados> desempregados) {
		this.desempregados = desempregados;
	}
	
	public void addDesempregado (Desempregados candidatos) {
		desempregados.add(candidatos);
	}
	
}
