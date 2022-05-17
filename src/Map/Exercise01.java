package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * 	Dada uma popula��o extimada de alguns estados do NE brasileiro fa�a
 * 
 * Estado = Popula��o = 
 * PE 		9.616.621
 * AL		3.351.543
 * CE		9.187.103
 * RN		3.534.265
 * 
 * Crie um dicionario e relacione os estados e suas popula��es
 * Substitua RN por 3.534.165
 * Confira se o estado da PB esteja dentro do dicion�rio PB 4.039.277
 * Exiba a Popula��o de PE
 * Exiba todos estados e suas popula��es na ordem que foi informado
 * Exiba todos estados e suas popula��es na ordem alfab�tica
 * Exiba os estados e suas popula��es em menor qtde
 * Exiba os estados e suas popula��es em maior qtde
 * Exiba a soma da popula��o dessses estados
 * Exbia a media da popula��o desses estados
 * Remova os estados coma popula��o 4.000.000
 * Apague o Dicionario 
 * Confira se o Dicion�rio esta vazio
 * 
 */

public class Exercise01 {

	public static void main(String[] args) {

		// Crie um dicionario e relacione os estados e suas popula��es
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
		System.out.println("Popula��o RN: " + estadosNe.get("RN"));

		// Confira se o estado da PB esteja dentro do dicion�rio PB 4.039.277
		System.out.println("--- Verifica��o PB ---");
		if (!estadosNe.containsKey("PB")) {
			estadosNe.put("PB", 4039277);
			System.out.println(estadosNe);
		} else {
			System.out.println("Estado PB j�cadastrasdo");
		}

		// Exiba a Popula��o de PE
		System.out.println("Popula��o PE: " + estadosNe.get("PE"));

		// Exiba todos estados e suas popula��es na ordem que foi informado
		System.out.println("--- Ordem de Inser��o ---");
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

		// Exiba todos estados e suas popula��es na ordem alfab�tica
		System.out.println("--- Ordem de Alfab�tica ---");
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

		// Exiba os estados e suas popula��es em menor qtde
		System.out.println("--- Menor Popula��o ---");

		Integer min = Collections.min(estadosNe.values());
		Set<Map.Entry<String, Integer>> entries = estadosNe.entrySet();
		String estadoMin = "";

		for (Map.Entry<String, Integer> entry : entries) {
			if (entry.getValue().equals(min)) {
				estadoMin = entry.getKey();
			}
		}
		System.out.println(estadoMin + "-" + min);

		// Exiba os estados e suas popula��es em maior qtde
		System.out.println("--- Maior Popula��o ---");

		Integer max = Collections.max(estadosNe.values());
		String estadoMax = "";

		for (Map.Entry<String, Integer> entry : entries) {
			if (entry.getValue().equals(max)) {
				estadoMax = entry.getKey();
			}
		}
		System.out.println(estadoMax + "-" + max);
		// Exiba a soma da popula��o dessses estados
		System.out.println("--- Soma Popula��o ---");
		Iterator<Integer> iterator = estadosNe.values().iterator();
		Integer qtdeEstados = estadosNe.size();
		Integer soma = 0;

		while (iterator.hasNext()) {
			soma += iterator.next();
		}

		System.out.println("Quantidade Estados: " + qtdeEstados);
		System.out.println("Popula��o dos Estados: " + soma);

		// Exbia a media da popula��o desses estados
		System.out.println("-- M�dia ---");
		System.out.println("Media da popula��o de : " + estadosNe.keySet());
		Integer media = soma / estadosNe.size();
		System.out.println(media);
		// Remova os estados coma popula��o 4.000.000
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
		// Confira se o Dicion�rio esta vazio
		System.out.println("A lista esta vazia ? "+estadosNe.isEmpty());
	}

}
