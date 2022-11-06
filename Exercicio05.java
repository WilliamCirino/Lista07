package tarefa07;

import java.util.Scanner;

//5) Ler 3 valores (A, B e C) representando as 
//medidas dos lados de um triângulo e escrever se formam ou não um triângulo. 
//OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o primeiro valor");
		int privalor = sc.nextInt();

		System.out.println("Insira o segundo valor");
		int segvalor = sc.nextInt();

		System.out.println("Insira o terceiro valor");
		int tervalor = sc.nextInt();

		int opcao1 = privalor + segvalor;
		int opcao2 = privalor + tervalor;
		int opcao4 = segvalor + tervalor;

		if (privalor < opcao4) {
			System.out.println("As medidas formam um triângulo!");
		} else {
			System.out.println("As medidas não formam um triângulo!");
		}
		if (segvalor < opcao2) {
			System.out.println("As medidas formam um triângulo!");
		} else {
			System.out.println("As medidas não formam um triângulo!");
		}
		if (tervalor < opcao1) {
			System.out.println("As medidas formam um triângulo!");
		} else {
			System.out.println("As medidas não formam um triângulo!");
			sc.close();
		}
	}
}