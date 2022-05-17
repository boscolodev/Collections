package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * 	Dada uma população extimada de alguns estados do NE brasileiro faça
 * 
 * Estado = População = 
 * PE 		9.616.621
 * AL		3.351.543
 * CE		9.187.103
 * RN		3.534.265
 * 
 * Crie um dicionario e relacione os estados e suas populações
 * Substitua RN por 3.534.165
 * Confira se o estado da PB esteja dentro do dicionário PB 4.039.277
 * Exiba a População de PE
 * Exiba todos estados e suas populações na ordem que foi informado
 * Exiba todos estados e suas populações na ordem alfabética
 * Exiba os estados e suas populações em menor qtde
 * Exiba os estados e suas populações em maior qtde
 * Exiba a soma da população dessses estados
 * Exbia a media da população desses estados
 * Remova os estados coma população 4.000.000
 * Apague o Dicionario 
 * Confira se o Dicionário esta vazio
 * 
 */

public class Exercise01 {

	public static void main(String[] args) {

		// Crie um dicionario e relacione os estados e suas populações
		Map<String, Integer> estadosNe = new HashMap<String, Integer>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
			}
		};

		// Substitua RN por 3.534.165
		estadosNe.put("RN", 3534165);
		System.out.println("População RN: " + estadosNe.get("RN"));

		// Confira se o estado da PB esteja dentro do dicionário PB 4.039.277
		System.out.println("--- Verificação PB ---");
		if (!estadosNe.containsKey("PB")) {
			estadosNe.put("PB", 4039277);
			System.out.println(estadosNe);
		} else {
			System.out.println("Estado PB jácadastrasdo");
		}

		// Exiba a População de PE
		System.out.println("População PE: " + estadosNe.get("PE"));

		// Exiba todos estados e suas populações na ordem que foi informado
		System.out.println("--- Ordem de Inserção ---");
		Map<String, Integer> estadosNeOrdemInsercao = new LinkedHashMap<String, Integer>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
				put("PB", 4039277);
			}
		};

		for (Map.Entry<String, Integer> neList : estadosNeOrdemInsercao.entrySet()) {
			System.out.println(neList.getKey() + "-" + neList.getValue());
		}

		// Exiba todos estados e suas populações na ordem alfabética
		System.out.println("--- Ordem de Alfabética ---");
		Map<String, Integer> estadosNeOrdemAlfabetica = new TreeMap<String, Integer>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
				put("PB", 4039277);
			}
		};

		for (Map.Entry<String, Integer> neList : estadosNeOrdemAlfabetica.entrySet()) {
			System.out.println(neList.getKey() + "-" + neList.getValue());
		}

		// Exiba os estados e suas populações em menor qtde
		System.out.println("--- Menor População ---");

		Integer min = Collections.min(estadosNe.values());
		Set<Map.Entry<String, Integer>> entries = estadosNe.entrySet();
		String estadoMin = "";

		for (Map.Entry<String, Integer> entry : entries) {
			if (entry.getValue().equals(min)) {
				estadoMin = entry.getKey();
			}
		}
		System.out.println(estadoMin + "-" + min);

		// Exiba os estados e suas populações em maior qtde
		System.out.println("--- Maior População ---");

		Integer max = Collections.max(estadosNe.values());
		String estadoMax = "";

		for (Map.Entry<String, Integer> entry : entries) {
			if (entry.getValue().equals(max)) {
				estadoMax = entry.getKey();
			}
		}
		System.out.println(estadoMax + "-" + max);
		// Exiba a soma da população dessses estados
		System.out.println("--- Soma População ---");
		Iterator<Integer> iterator = estadosNe.values().iterator();
		Integer qtdeEstados = estadosNe.size();
		Integer soma = 0;

		while (iterator.hasNext()) {
			soma += iterator.next();
		}

		System.out.println("Quantidade Estados: " + qtdeEstados);
		System.out.println("População dos Estados: " + soma);

		// Exbia a media da população desses estados
		System.out.println("-- Média ---");
		System.out.println("Media da população de : " + estadosNe.keySet());
		Integer media = soma / estadosNe.size();
		System.out.println(media);
		// Remova os estados coma população 4.000.000
		Iterator<Integer> iterator1 = estadosNe.values().iterator();

		while (iterator1.hasNext()) {
			if(iterator1.next() < 4000000) {
				iterator1.remove();
			}
		}
		
		System.out.println(estadosNe);

		// Apague o Dicionario
		System.out.println("-- Apague a Lista e Verifique se esta vazia --");
		estadosNe.clear();
		// Confira se o Dicionário esta vazio
		System.out.println("A lista esta vazia ? "+estadosNe.isEmpty());
	}

}
