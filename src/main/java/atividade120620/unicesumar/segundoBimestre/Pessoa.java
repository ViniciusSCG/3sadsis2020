package unicesumar.segundoBimestre;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private ArrayList <CartaoDeCredito> cartoes;
	
	public Pessoa(String nome, CartaoDeCredito cartao){
		this.nome = nome;
		cartoes = new ArrayList();
		this.cartoes.add(cartao);
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<CartaoDeCredito> getCartoes() {
		return cartoes;
	}
	public void setCartoes(ArrayList<CartaoDeCredito> cartoes) {
		this.cartoes = cartoes;
	}
	
	public void addCartao(CartaoDeCredito cartao){
		cartoes.add(cartao);
	}
	
}
