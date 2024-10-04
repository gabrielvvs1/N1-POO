package br.com.hotel;

public class SuitePresidencial extends Quartos{ // Heranca
	
	private String AcessoSpa;

	
	public SuitePresidencial(String categoria, double num, double preco, int dias, String acessoSpa) {
	super(categoria, num, preco, dias);
	AcessoSpa = acessoSpa;
}



	public void servicos3() { //Suite presidencial
		System.out.println("Quarto com acesso ao Spa");
	}


	//Polimorfismo das informaçoes do quarto
	@Override
	public void exibirInformacao() {
		// TODO Auto-generated method stub
		super.exibirInformacao();
	}


	//Polimorfismo do valor da diaria para o quarto Suite presidencial
	@Override
	public double diaria(double preco, int dias) {
		// TODO Auto-generated method stub
		return super.diaria(preco, dias)* 1.25;
	}


	
	
	
	
	

		
}
