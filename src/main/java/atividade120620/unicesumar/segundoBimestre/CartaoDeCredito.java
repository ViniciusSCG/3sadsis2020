package unicesumar.segundoBimestre;


import java.util.Date;

public class CartaoDeCredito {
	private String bandeira;
	private String numero;
	private int cvv;
	private String validade;
	
	
	@Override
	public String toString() {
		return "CartaoDeCredito [bandeira:" + bandeira + ", numero:" + numero + ", cvv:" + cvv + ", validade:"
				+ validade + "]\n";
	}

	public CartaoDeCredito(String bandeira, String numero, int cvv, String val){
		this.bandeira = bandeira;
		this.numero = numero;
		this.cvv = cvv;
		this.validade = val;
	   
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	
	
	
}
