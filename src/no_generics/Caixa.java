package no_generics;

public class Caixa {

	private Object coisa;
	
	public void guardarObjeto(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrirCaixa() {
		return this.coisa;
	}
}