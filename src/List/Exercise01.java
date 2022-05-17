package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista
 * Após isto, calcula a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês ocorreram
 * Ex 	1- Janeiro 25º
 * 		2- Abril   30º
 * 
 * */

public class Exercise01 {
	public static void main(String[] args) {

		List<Mounth> mounthList = new ArrayList<Mounth>();

		Scanner sc = new Scanner(System.in);
		Double amountTemperature = 0d;
		Double avarageTemperature = 0d;

		for (int x = 0; x < 6; x++) {
			System.out.println("Digite o Mês:");
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
		System.out.println("A média de temperatura dos 6 primeiros meses é: " + avarageTemperature);

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
