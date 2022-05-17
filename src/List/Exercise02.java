package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa
 * sobre um crime as perguntas são
 * 
 * Telefonou para a Vítima
 * Esteve no local do crime
 * Mora perto da Vítima
 * Devia para a vítima
 * Já trabalhou com a vítima
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
				add("Telefonou para a Vítima");
				add("Esteve no local do crime");
				add("Mora perto da Vítima");
				add("Devia para a vítima");
				add("Já trabalhou com a vítima");
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
			System.out.println("Cúmplice");
		}else {
			System.out.println("Inocente");
		}
		
		sc.close();
	}

}
