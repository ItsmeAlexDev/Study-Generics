package no_generics;

public class CaixaTeste {


	public static void main(String[] args) {
		
		Caixa caixa_A = new Caixa();
		
		caixa_A.guardarObjeto(5.5);
		
		Double numero = (Double) caixa_A.abrirCaixa();
		System.out.println(numero);
		
		
		
		Caixa caixa_B = new Caixa();
		
		caixa_B.guardarObjeto("Olá mundo!");
		
		String texto = (String) caixa_B.abrirCaixa();
		System.out.println(texto);
	}
}
