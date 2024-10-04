package br.com.hotel;

public class Main { // heranca

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                                   // categoria, num, preco, dias
		Quartos objQS = new Quartos("Simples", 1.00, 30.00, 10 );
		objQS.exibirInformacao();
		objQS.diaria(30.00, 10); // preco - dias
		
		
		System.out.println("********************************************");
		
									// categoria, num, preco, dias
		Quartos objQL = new Quartos("Luxo", 3.00, 100.00, 10);
		objQL.exibirInformacao();
		objQL.diaria(100.0 , 10);
		
		
		System.out.println("********************************************");
		
									// categoria, num, preco, dias
		Quartos objSP = new Quartos("Suite Presidencial", 20.00, 250.00, 10);
		objSP.exibirInformacao();
		objSP.diaria(250 , 10);
		
		// nao consegui fazer o calculo da diaria que corresponda a categoria do quato
		
	}

}
