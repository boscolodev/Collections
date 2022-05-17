package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Utilizando listas, fa�a um programa que fa�a 5 perguntas para uma pessoa
 * sobre um crime as perguntas s�o
 * 
 * Telefonou para a V�tima
 * Esteve no local do crime
 * Mora perto da V�tima
 * Devia para a v�tima
 * J� trabalhou com a v�tima
 * 
 * 
 * */

public class Exercise02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> answer = new ArrayList<String>();
		Integer count = 0;

		List<String> crimeList = new ArrayList<String>() {
			private static final long serialVersionUID = 1L;

			{
				add("Telefonou para a V�tima");
				add("Esteve no local do crime");
				add("Mora perto da V�tima");
				add("Devia para a v�tima");
				add("J� trabalhou com a v�tima");
			}
		};

		for (int x = 0; x < 5; x++) {
			System.out.println(crimeList.get(x));
			answer.add(sc.nextLine().toLowerCase());

			if (answer.get(x).contains("s")) {
				count += 1;
			}
		}

		if(count.equals(5)) {
			System.out.println("Culpada");
		}else if(count >1 && count < 3) {
			System.out.println("Suspeita");
		}else if(count >2 && count <5) {
			System.out.println("C�mplice");
		}else {
			System.out.println("Inocente");
		}
		
		sc.close();
	}

}
