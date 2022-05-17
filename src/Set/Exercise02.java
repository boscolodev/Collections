package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
 * 	Crie um conjunto contendo as cores do arco-íris e:
 * 
 * 	A - Exiba todas as cores uma abaixo da outra 
 *  B - A quantidade de cores que o arcos íris tem
 *  C - Exiba as cores em ordem alfabética
 *  D - Exiba as cores na ordem inversa da que foi informada
 *  E - Exiba todas as cores que começam com al etra "v"
 *  F - Remova todas as cores que não começam com a letra V
 * 	G - Limpe o Conjunto
 * 	H - Confira se o conjunto esta vazio
 * 
 */


public class Exercise02 {

	public static void main(String[] args) {
		Set<Rainbow> rainbow = new HashSet<Rainbow>() {
			{
				add(new Rainbow("Vermelho"));
				add(new Rainbow("Laranja"));
				add(new Rainbow("Amarelo"));
				add(new Rainbow("Verde"));
				add(new Rainbow("Azul"));
				add(new Rainbow("Anil"));
				add(new Rainbow("Violeta"));
			}
		};

		// A - Exiba todas as cores uma abaixo da outra
		for (Rainbow r : rainbow) {
			System.out.println(r.getColors());
		}

		// B - A quantidade de cores que o arco-íris possui
		System.out.println("O Arco Íris possui: " + rainbow.size() + " cores.");

		// C - Exiba as cores em ordem Alfabética
		Set<Rainbow> rainbowOrderedByName = new TreeSet<>(rainbow);
		System.out.println("Order By Name: " + rainbowOrderedByName);

		// D - Exiba as cores na ordem inversa que foi informada
		List<Rainbow> rainbowReverList = new ArrayList<Rainbow>();
		rainbowReverList.addAll(rainbow);
		System.out.println("List:" + rainbowReverList);
		Collections.reverse(rainbowReverList);

		System.out.println("Reverse List:" + rainbowReverList);

		// E - Exiba todas as cores que começam com a letra V
		for (Rainbow collor : rainbow) {
			if (collor.getColors().toLowerCase().startsWith("v")) {
				System.out.println(collor);
			}
			;
		}

		// F - Remova todas as cores que começam aom a letra V
		Iterator<Rainbow> iterator = rainbow.iterator();
		while (iterator.hasNext()) {
			if ( !iterator.next().getColors().toLowerCase().startsWith("v")) {
				iterator.remove();
			}
		}
		System.out.println("Remova todas cores que começam com V:" + rainbow);

		//G - Limpe o conjunto
		rainbow.clear();
		
		//H - Verifique se o conjunto esta vazio
		System.out.println("O cojunto esta vazio ? " + rainbow.isEmpty());
		
	}
}

class Rainbow implements Comparable<Rainbow> {

	private String colors;

	public Rainbow(String colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "Rainbow [colors=" + colors + "]";
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	@Override
	public int hashCode() {
		return Objects.hash(colors);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rainbow other = (Rainbow) obj;
		return Objects.equals(colors, other.colors);
	}

	@Override
	public int compareTo(Rainbow o) {
		return this.getColors().compareTo(o.getColors());

	}

}
