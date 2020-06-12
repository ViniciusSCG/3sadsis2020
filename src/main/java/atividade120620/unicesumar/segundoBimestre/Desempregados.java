package unicesumar.segundoBimestre;

import java.util.ArrayList;

public class Desempregados {
	private String nome;
	private ArrayList<EmpresasContratando> empresas = new ArrayList<>();
	
	public Desempregados (String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<EmpresasContratando> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(ArrayList<EmpresasContratando> empresas) {
		this.empresas = empresas;
	}

	public void addEmpresas (EmpresasContratando empresa) {
		empresas.add(empresa);
	}
}
