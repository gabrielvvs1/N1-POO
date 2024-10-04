package br.com.hotel;

public class Quartos {
	private String categoria;
	private double num;
	private double preco;
	private int dias;
	
	public Quartos(String categoria, double num, double preco, int dias) {
		super();
		this.categoria = categoria;
		this.num = num;
		this.preco = preco;
		this.dias = dias;
	}

	//ENCAPSULAMENTO
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}


	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	
	public int getDias() {
		return dias;
	}


	public void setDias(int dias) {
		this.dias = dias;
	}



	public void exibirInformacao() {
		
		System.out.println("Categoria: "+categoria);
		System.out.println("Numero: "+num);
		System.out.println("Preco: "+preco);
		System.out.println("Dias: "+dias);
	}


	public double diaria (double preco , int dias) {
		
		return preco * dias;
		}
		
	

}
