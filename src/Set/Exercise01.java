package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Crie uma classe linguagem favoria que possua os atributos nome, anoDeCriacao,
 * ide Em seguida crie um conjuno com 3 linguagens diferentes e faça um programa
 * que ordene esse conjunto por:
 * 
 * Ordem de Inserção, Ordem Natural, IDE Ano de Criação e Nome Nome, Ano de
 * Crição e IDE
 * 
 * Ao final exiba as linguagens no console, um abaixo da outra.
 */

public class Exercise01 {

	public static void main(String[] args) {

		Set<Language> languages = new HashSet<Language>() {
			{
				add(new Language("Java", 1996, "Eclipse"));
				add(new Language("Asp", 2002, "Visual Studio"));
				add(new Language("Phyton", 1994, "Notepad"));
			}
		};
		// Ordem Aleatória
		System.out.println("Ordem Aleatória:");
		for (Language l : languages) {
			System.out.println("Nome: " + l.getName() + " Ano: " + l.getYear() + " IDE: " + l.getIde());
		}

		// Ordem Natural
		System.out.println("--- Ordem Natural: ---");
		Set<Language> naturalOrder = new TreeSet<>(languages);
		for (Language l : naturalOrder) {
			System.out.println(l);
		}

		// Ordem by IDE
		System.out.println("--- Ordem By IDE: ---");

		Set<Language> language2 = new TreeSet<>(new OrderByIDE());
		language2.addAll(languages);

		System.out.println(language2);

		// Order By Year
		System.out.println("--- Order By Year ---");
		Set<Language> language3 = new TreeSet<>(new OrderByYear());
		language3.addAll(language2);
		System.out.println(language3);

		// Order By All Atributes
		System.out.println("--- Order By Name/Year/IDE ---");
		Set<Language> language4 = new TreeSet<Language>(new OrderByAllAtributes());
		language4.addAll(language3);
		for (Language l : language4) {
			System.out.println(l);
		}
	}

}

class OrderByAllAtributes implements Comparator<Language> {

	@Override
	public int compare(Language o1, Language o2) {
		int name = o1.getName().compareTo(o2.getName());
		if (name != 0) {
			return name;
		}
		int year = Integer.compare(o1.getYear(), o2.getYear());
		if (year != 0) {
			return year;
		}
		return o1.getIde().compareTo(o2.getIde());
	}

}

class OrderByYear implements Comparator<Language> {

	@Override
	public int compare(Language o1, Language o2) {
		return Integer.compare(o1.getYear(), o2.getYear());
	}

}

class NaturalOrder implements Comparable<Language> {

	@Override
	public int compareTo(Language o) {
		return Integer.compare(o.getYear(), o.getYear());
	}
}

class OrderByIDE implements Comparator<Language> {

	public int compare(Language o1, Language o2) {
		return o1.getIde().compareTo(o2.getIde());
	}
}

class Language implements Comparable<Language> {

	private String name;
	private Integer year;
	private String ide;

	public Language() {

	}

	public Language(String name, Integer year, String ide) {
		this.name = name;
		this.year = year;
		this.ide = ide;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	@Override
	public String toString() {
		return "Language [name=" + name + ", year=" + year + ", ide=" + ide + "]";
	}

	@Override
	public int compareTo(Language o) {
		return Integer.compare(this.getYear(), o.getYear());
	}

}
