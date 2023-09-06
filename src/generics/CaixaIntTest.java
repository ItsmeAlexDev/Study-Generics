package generics;

public class CaixaIntTest {

	public static void main(String[] args) {
		
		CaixaInt caixa_A = new CaixaInt();
		caixa_A.guardar(123);
		
		Integer coisa_A = caixa_A.abrir();
		System.out.println(coisa_A);
		
	}
}
