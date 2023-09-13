package generics_in_use;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new LinkedHashSet<>();

	public void adicionar(C chave, V valor) {
		if (chave == null) return;
		
		Par<C, V> newPar = new Par<C, V>(chave, valor);
		
		if (itens.contains(newPar))
			itens.remove(newPar);
		itens.add(newPar);
	}
	
	public V getValor(C chave) {
		if (chave == null) return null;
		
		Optional<Par<C, V>> optPar = itens.stream()
										  .filter(par -> chave.equals(par.getChave()))
										  .findFirst();
		
		return (optPar.isPresent() ? optPar.get().getValor() : null);
	}
}