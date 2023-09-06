package generics;

public class CaixaNumeroTest {

	public static void main(String[] args) {
		
		CaixaNumero<Double> caixa_A = new CaixaNumero<>();
		caixa_A.guardar(4.6692);
		System.out.println(caixa_A.abrir());

		CaixaNumero<Integer> caixa_B = new CaixaNumero<>();
		caixa_B.guardar(46692);
		System.out.println(caixa_B.abrir());
	}
}
