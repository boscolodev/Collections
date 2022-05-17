package Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FundamentosSet {

	public static void main(String[] args) {
		
		//Aula sobre Fundamentos
		
		Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
		
		System.out.println(notas.toString());
		
		
		//Confira se a nota 5 esta no conjuntos
		System.out.println(notas.contains(5d));

		
		//Exiba a menor nota
		System.out.println(Collections.min(notas));
		
		//Exiba a maior nota
		System.out.println(Collections.max(notas));

		Double soma = 0d;
		//Exiba a soma dos valores
		for(Double d : notas) {
			soma += d;
		}
		System.out.println("Soma dos valores: " + soma);
		
		//Média das notas
		System.out.println((soma/notas.size()));		

		
		//Remova a nota 0
		notas.remove(0d);
		System.out.println(notas);
		
		//Remova a nota na posição 0
		System.out.println();
		
		//Remova as notas menores que 7 e exiba na lista
		Iterator<Double> iterator = notas.iterator();
		while(iterator.hasNext()) {
			Double next = iterator.next();
			if (next < 7){
				iterator.remove();
			}
		}
		System.out.println(notas);

		//Exiba todas notas na ordem que foram informadas
		
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		
		System.out.println(notas2);


		//Exiba todas notas na ordem crescente
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);

		//Apague todo o conjunto
		notas.clear();
		System.out.println(notas.isEmpty());
		System.out.println(notas2.isEmpty());
		System.out.println(notas3.isEmpty());

		
	}

}
