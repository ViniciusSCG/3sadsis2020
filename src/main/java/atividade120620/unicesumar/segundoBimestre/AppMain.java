package unicesumar.segundoBimestre;


public class AppMain {

	public static void main(String[] args) {
		
		
		Pessoa pessoa = new Pessoa("Vinicius Carvalho",new CartaoDeCredito("visa", "1234.5678.9123.4567", 123, "07/26"));
		
		CartaoDeCredito mastercard = new CartaoDeCredito("mastercard", "1111.2222.3333.4444", 111, "06/28");
		
		pessoa.addCartao(mastercard); 
	
		System.out.println("Nome:"+pessoa.getNome());
		System.out.println(pessoa.getCartoes());
		System.out.println("---------------------------------------------------------------------------");
		
		Time flamengo = new Time("flamengo");
		
		Torcedor fulano = new Torcedor(flamengo,"Vinicius Silva");
		
		System.out.println("Time do torcedor:"+ flamengo.getTorcedor().getNome());
		System.out.println("Torcedor do time:"+ fulano.getTime().getNome());
	
		System.out.println("---------------------------------------------------------------------------");
		Desempregados joao = new Desempregados("Joao");
		Desempregados pedro = new Desempregados("Pedro");
		
		EmpresasContratando benner = new EmpresasContratando("Benner");
		EmpresasContratando hbsis = new EmpresasContratando("HBSIS");
		
		Desempregados ana = new Desempregados("Ana");
		Desempregados maria = new Desempregados("Maria");
		
		hbsis.addDesempregado(ana);
		hbsis.addDesempregado(maria);
		
		benner.addDesempregado(joao);
		benner.addDesempregado(pedro);
		
		System.out.println("Nome dos candidatos da empresas " + benner.getNome());
		for (Desempregados desempregados : benner.getDesempregados()  ) {
			System.out.println(desempregados.getNome());		
		}
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Nome dos candidatos da empresas " + hbsis.getNome());
		for (Desempregados desempregados : hbsis.getDesempregados()  ) {
			System.out.println(desempregados.getNome());		
		}
		
	}

}

