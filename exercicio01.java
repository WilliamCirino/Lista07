package exercicios08;

import java.util.Scanner;

//1) Ler um valor e escrever se é positivo, negativo ou zero.

public class exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número. (Positivo ou negativo.)");
		int numero1 = sc.nextInt();

		if (numero1 >= 0) {
			System.out.println("O numero digitado é Positivo");
		} else {
			System.out.println("O numero é Negativo.");
		}
		sc.close();
	}
}