package generics_basics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixa_A = new Caixa<>();
		caixa_A.guardar("Olá mundo!");
		
		String coisa_A = caixa_A.abrir();
		System.out.println(coisa_A);
		
		
		
		Caixa<Double> caixa_B = new Caixa<>();
		caixa_B.guardar(2.5029);
		
		Double coisa_B = caixa_B.abrir();
		System.out.println(coisa_B);
	}
}