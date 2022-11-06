package tarefa07;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos KG de Morango foram vendidos");
		float kgmorango = sc.nextFloat();

		System.out.println("Digite quantos KG de Maçã foram vendidos");
		float kgmaca = sc.nextFloat();

		double precomorsd = 2.50;
		double precomorcd = 2.20;
		double precomacasd = 1.80;
		double precomacacd = 1.50;

		double somapreco = precomorsd * kgmorango;
		double somapreco1 = precomorcd * kgmorango;
		double somapreco2 = precomacasd * kgmaca;
		double somapreco3 = precomacacd * kgmaca;

		double totalvalorcd = somapreco1 + somapreco3;

		double descontototal1 = totalvalorcd - (totalvalorcd * 10 / 100);
		double somafrutas = kgmorango + kgmaca;
		if (kgmorango <= 5) {
			System.out.println("Preço total do Morango:" + somapreco);
		} else if (kgmorango > 5) {
			System.out.println("Preço total do Morango:" + somapreco1);
		}
		if (kgmaca <= 5) {
			System.out.println("Preço total da Maçã: " + somapreco2);
		} else if (kgmaca > 5) {
			System.out.println("Preço total da Maçã: " + somapreco3);
			if (somafrutas > 8) {
				System.out.println("Valor total da compra: " + descontototal1);
			} else if (totalvalorcd > 25.0) {
				System.out.println("Valor total da compra: " + descontototal1);
			}
			sc.close();
		}
	}
}