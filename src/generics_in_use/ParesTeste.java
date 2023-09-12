package generics_in_use;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> matematicos = new Pares<>();
		
		matematicos.adicionar(1, "Newton");
		matematicos.adicionar(2, "Euler");
		matematicos.adicionar(3, "Neumann");
		matematicos.adicionar(4, "Noether");
		matematicos.adicionar(5, "Turing");
		matematicos.adicionar(6, "Cardano");
		matematicos.adicionar(7, "Einstein");
		matematicos.adicionar(8, "Conway");

		System.out.println("3: " + matematicos.getValor(3));

		matematicos.adicionar(3, "Germain");
		

		System.out.println("1: " + matematicos.getValor(1));
		System.out.println("2: " + matematicos.getValor(2));
		System.out.println("3: " + matematicos.getValor(3));
		System.out.println("4: " + matematicos.getValor(4));
		System.out.println("5: " + matematicos.getValor(5));
		System.out.println("6: " + matematicos.getValor(6));
		System.out.println("7: " + matematicos.getValor(7));
		System.out.println("8: " + matematicos.getValor(8));

		
	}

}
