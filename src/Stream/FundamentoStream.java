package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FundamentoStream {

	public static void main(String[] args) {

		List<String> numeroAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

		System.out.println("Imprime todos os elementos dessa lista de String: ");
		numeroAleatorios.forEach(System.out::println);

		System.out.println("Pegue os 5 primeiros e colqiueo dentro de um Set");
		numeroAleatorios.stream().limit(5) // Quantidade e Elementos a serem capturados
				.collect(Collectors.toSet()) // Joga os 5 primeiros dentro de um Set
				.forEach(System.out::println); // Imprime na tela;

		// Set List recebendo valor dos 5 primeiros via stream
		Set<String> collectSet = numeroAleatorios.stream().limit(5).collect(Collectors.toSet()); //

		System.out.println("Transforme essa lista de string em uma lista de números inteiros");
		List<Integer> collectList = numeroAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());

		System.out.println(collectList);

		System.out.println("Pegue os números pares maiores que 2 e coloque em uma lista");

		List<Integer> oddList = numeroAleatorios.stream().map(Integer::parseInt).filter(i -> (i % 2 == 0 && i > 2))
				.collect(Collectors.toList());

		System.out.println(oddList);

		System.out.println("Mostre a Média dos números");

		numeroAleatorios.stream()
		.mapToInt(Integer::parseInt)
		.average()
		.ifPresent(System.out::println);
		
		System.out.println("Remova os Valores Ímpares");
		collectList.removeIf(i -> (i%2 !=0));
		System.out.println(collectList);
		
		
	}

}