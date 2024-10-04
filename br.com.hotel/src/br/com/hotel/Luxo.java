package br.com.hotel;

public class Luxo extends Quartos { // heranca
	
	private String KitCafe;

	//construtor
	public Luxo(String categoria, double num, double preco, int dias, String kitCafe) {
	super(categoria, num, preco, dias);
	KitCafe = kitCafe;
}


	public void servicos2() { //quarto de luxo
		System.out.println("Quarto com cafe da manha");
	}


	//Polimorfismo das informaçoes do quarto
	@Override
	public void exibirInformacao() {
		// TODO Auto-generated method stub
		super.exibirInformacao();
	}


	@Override
	public double diaria(double preco, int dias) {
		// TODO Auto-generated method stub
		return super.diaria(preco, dias) * 1.70 ;
	}


	
	

	
	
	
}
