package tarefa07;

import java.util.Scanner;

/*7) Ler dois valores e imprimir uma das três mensagens a seguir:

‘Números iguais’, caso os números sejam iguais

‘Primeiro é maior’, caso o primeiro seja maior que o segundo;

‘Segundo maior’, caso o segundo seja maior que o primeiro.*/

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor");
		int num1 = sc.nextInt();

		System.out.println("Digite o segundo valor");
		int num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println("Os valores são iguais");
		} else if (num1 > num2) {
			System.out.println("O primeiro valor é maior");
		}
		if (num2 > num1) {
			System.out.println("O segundo valor é maior");
		}
		sc.close();
	}
}