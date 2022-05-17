package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * 1. Caracteristicas da Interface Map
 * 2. Como e quando utilizar HashMap, LinkedHashMap,TreeMap
 * 3. Conhecer os principais métodos
 * 
 */

public class Fundamentos {

	public static void main(String[] args) {

		/*
		 * Dados modelos dos carros e seus respectivos consumos na estrada faça
		 * 
		 * modelo = gol - consumo = 14,4km/l modelo = uno - consumo = 15,6km/l modelo =
		 * mobi - consumo = 16,1km/l modelo = hb20 - consumo = 14,5km/l modelo = kwid -
		 * consumo = 15,6km/l
		 * 
		 */

		System.out.println("Crie um dicionário que relacione os modeos e seus respectivos consumos.");

		Map<String, Double> carrosPopulares = new HashMap() {
			{
				;
				put("gol", 14.4);
				put("uno", 15.6);
				put("mobi", 16.1);
				put("hb20", 14.5);
				put("kiwd", 15.6);
			}
		};

		// Exibir Map
		System.out.println(carrosPopulares);

		// Substitua o consumo do gol por 15.2
		carrosPopulares.put("gol", 16.1);
		System.out.println(carrosPopulares);

		// Confira se o modelo Tucson esta no dicionário
		String car = "Tucson".toLowerCase();
		System.out.println("Tucson Esta dentro do MAP: " + carrosPopulares.containsKey(car));

		// Exiba o consumo do uno
		System.out.println("Consumo do Uno: " + carrosPopulares.get("uno"));

		// Exiba os modelos
		// Keyset Retorna um SET
		Set<String> returnCarrosPopularesModelos = carrosPopulares.keySet();
		System.out.println("Modelos:" + returnCarrosPopularesModelos);

		// Exiba os Consumos
		// Values retorna uma collection
		Collection<Double> returnCarroPopularesConsumo = carrosPopulares.values();
		System.out.println(returnCarroPopularesConsumo);

		// Exiba o Modo mais economico
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

		String modeloMaisEconomico = "";

		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEconomico = entry.getKey();
				System.out
						.println("Modelo mais Eficiente: " + modeloMaisEconomico + "Consumo: " + consumoMaisEficiente);

			}
		}

		// Exiba o modelo menos economica
		Double consumoMenosEficinete = Collections.min(carrosPopulares.values());
		String modeloMenosEconomico = "";

		for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if (entry.getValue().equals(consumoMenosEficinete)) {
				modeloMenosEconomico = entry.getKey();
				System.out.println(
						"Modelo Menos Eficiente: " + modeloMenosEconomico + " Consumo: " + consumoMenosEficinete);
			}
		}
		
		//Exiba a soma dos Consumos
		Double soma = 0d;
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		
		while(iterator.hasNext()) {
			soma+=iterator.next();
		}
		System.out.println(soma);
	
		//Exiba a média do consumo desse dicionário
		System.out.println(soma/carrosPopulares.size());
	
		
		//Remova os modelos com consumo igual a 15.6
		System.out.println(carrosPopulares);
		
		Iterator<Double> iteratorConsumo = carrosPopulares.values().iterator();
		
		while(iteratorConsumo.hasNext()) {
			if(iteratorConsumo.next().equals(15.6)) {
				iteratorConsumo.remove();
			}
		}
		System.out.println(carrosPopulares);
		
		//Exiba todos os carros na Ordem que Foram Informados
		
		Map<String, Double> carrosPopularesLinked = new LinkedHashMap<String, Double>() {
			{
				;
				put("gol", 14.4);
				put("uno", 15.6);
				put("mobi", 16.1);
				put("hb20", 14.5);
				put("kiwd", 15.6);
			}
		};
		
		System.out.println("Ordem de inserção:" + carrosPopularesLinked.toString());
		
		//Exiba o Dirionário Ordenando pelo Modelo
		Map<String, Double> carrosPopularesTree = new TreeMap<String, Double>(carrosPopularesLinked) {
			{
				;
				put("gol", 14.4);
				put("uno", 15.6);
				put("mobi", 16.1);
				put("hb20", 14.5);
				put("kiwd", 15.6);
			}
		};
		
		System.out.println("Ordenado pelo Modelo: "+carrosPopularesTree);
		
		//Apague o Dicionário de carro
		carrosPopulares.clear();
		System.out.println("Carros foi apagado: "+carrosPopulares.isEmpty());
		
	}

}
