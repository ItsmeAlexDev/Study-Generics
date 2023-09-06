package generics_in_use;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTest {

	public static void main(String[] args) {
		List<String> cientistas = Arrays.asList("Einstein", "Darwin", "Planck", "Newton");
		List<Double> constantes = Arrays.asList(3.1415, 2.5029, 4.6692, 2.718, 1.6180);
		
		String ultimoCientista1 = (String) ListaUtil.getUltimo1(cientistas);
		System.out.println(ultimoCientista1);
		
		Double UltimaConstante1 = (Double) ListaUtil.getUltimo1(constantes);
		System.out.println(UltimaConstante1);

		String ultimoCientista2 = ListaUtil.getUltimo2(cientistas);
		System.out.println(ultimoCientista2);
		
		Double UltimaConstante2 = ListaUtil.getUltimo2(constantes);
		System.out.println(UltimaConstante2);
	}

}
