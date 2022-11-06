package tarefa07;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digte o valor de x");
		int x = sc.nextInt();

		System.out.println("Digte o valor de y");
		int y = sc.nextInt();

		int z = (x * y) + 5;
		if (z <= 0) {
			System.out.println("Resposta A");
		} else if (z <= 100) {
			System.out.println("Resposta B");
		} else {
			System.out.println("Resposta C");
			sc.close();
		}
	}
}