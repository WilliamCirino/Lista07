package tarefa07;

import java.util.Scanner;

/*9) Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), 
calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.*/

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos litros foram vendidos");
		int litvend = sc.nextInt();
		
		double A = 2.90;
		double G = 3.30;
		double precoa = A * litvend;
		double precog = G * litvend;
		
		System.out.println("Selecione o tipo de combustível");
		
		System.out.println("1-Álcool");
		
		System.out.println("2-Gasolina");
		
		int comb = sc.nextInt();
		double menospora = (A * 3) / 100 * litvend;
		double maispora = (A * 5) / 100 * litvend;
		double menosporg = (G * 4) / 100 * litvend;
		double maisporg = (G * 6) / 100 * litvend;

		double totalmenosa = precoa - menospora;
		double totalmaisa = precoa - maispora;
		double totalmenosg = precog - menosporg;
		double totalmaisg = precog - maisporg;

		if (comb == 1 && litvend <= 20) {
			System.out.println("Total a Pagar R$:" + totalmenosa);
		} else if (comb == 1 && litvend >= 20) {
			System.out.println("Total a Pagar R$:" + totalmaisa);
		}
		if (comb == 2 && litvend <= 20) {
			System.out.println("Total a Pagar R$:" + totalmenosg);
		} else if (comb == 2 && litvend >= 20) {
			System.out.println("Total a Pagar R$:" + totalmaisg);
		}
		sc.close();
	}
}