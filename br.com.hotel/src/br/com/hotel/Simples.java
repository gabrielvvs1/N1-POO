package br.com.hotel;

public class Simples extends Quartos {   //Heranca
	
	private String kitHigiene;
	
	//construtor
	public Simples(String categoria, double num, double preco, int dias, String kitHigiene) {
		super(categoria, num, preco, dias);
		this.kitHigiene = kitHigiene;
	}


	public void servicos1() { 
		System.out.println("Quarto com kit higiene");
		
	}


	//Polimorfismo das informaçoes do quarto
	@Override
	public void exibirInformacao() {
		// TODO Auto-generated method stub
		super.exibirInformacao();
	}

	//Polimorfismo do valor da diaria para o quarto simples
	@Override
	public double diaria(double preco, int dias) {
		// TODO Auto-generated method stub
		return super.diaria(preco, dias);
	}

	
	
	
	

	

	
	
	
	
	
	
	 

}
