package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Fa�a um programa que receba a temperatura m�dia dos 6 primeiros meses do ano e armazene-as em uma lista
 * Ap�s isto, calcula a m�dia semestral das temperaturas e mostre todas as temperaturas acima desta m�dia, e em que m�s ocorreram
 * Ex 	1- Janeiro 25�
 * 		2- Abril   30�
 * 
 * */

public class Exercise01 {
	public static void main(String[] args) {

		List<Mounth> mounthList = new ArrayList<Mounth>();

		Scanner sc = new Scanner(System.in);
		Double amountTemperature = 0d;
		Double avarageTemperature = 0d;

		for (int x = 0; x < 6; x++) {
			System.out.println("Digite o M�s:");
			String mes = sc.next();
			System.out.println("Digite a temperatura de " + mes + ":");
			Double temperature = sc.nextDouble();
			Mounth mounth = new Mounth(mes, temperature);
			mounthList.add(mounth);
		}

		for (Mounth m : mounthList) {
			amountTemperature += m.getTemperature();
		}

		avarageTemperature = (amountTemperature / mounthList.size());
		System.out.println("A m�dia de temperatura dos 6 primeiros meses �: " + avarageTemperature);

		for (Mounth m : mounthList) {
			if (m.getTemperature() > avarageTemperature) {
				System.out.println(m.getMounth() + ": " + "Temperatura: " + m.getTemperature());
			}
		}
		sc.close();
	}
}

class Mounth {

	private String mounth;
	private Double temperature;

	public Mounth() {
	}

	public Mounth(String mounth, Double temperature) {
		this.mounth = mounth;
		this.temperature = temperature;
	}

	public String getMounth() {
		return mounth;
	}

	public void setMounth(String mounth) {
		this.mounth = mounth;
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "mounth [mounth=" + mounth + ", temperature=" + temperature + "]";
	}
}
