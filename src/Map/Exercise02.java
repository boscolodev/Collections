package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Exercise02 {
	
	/*	
	 * 	Faça um programa que simule o lançamento de um dado 100x
	 * 	Depois mostre quantas vezes cada valor foi inserido.
	 */

	public static void main(String[] args) {

		Integer quantidadeLancamento = 100;
		Random random = new Random();
		
		List<Integer> randomNumber = new ArrayList<Integer>();
		
		//Gera os100 Números Aleatórios
		for(int x=0; x<quantidadeLancamento; x++) {
			randomNumber.add(random.nextInt(6)+1);
		}
		
		//Cria o mapa de índice e valor
		Map<Integer, Integer> dice = new HashMap<Integer, Integer>();
		
		//Alimenta os lançamentos por resultados
		for(Integer r : randomNumber) {
			if(dice.containsKey(r)) {
				dice.put(r, (dice.get(r)+1));
			}else {
				dice.put(r, 1);
			}
		}
		
		//Exibe o resultado
		System.out.println("\nValor "+ " Qtde Vezes");
		for(Map.Entry<Integer, Integer> entry : dice.entrySet()) {
			System.out.printf("%3d %10d\n",entry.getKey(), entry.getValue());
		}
		
	}

}
