package tarefa07;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o Código do empregado");
		int codigoEmpregado = sc.nextInt();

		System.out.println("Digite o ano do nascimento");
		int anoNascimento = sc.nextInt();

		System.out.println("Digite o ano que o empregado ingressou na empresa");
		int anoIngresso = sc.nextInt();

		int idade = 2022 - anoNascimento;
		int tempocasa = 2022 - anoIngresso;

		System.out.println("Idade: " + idade);

		System.out.println("Tempo de casa: " + tempocasa);

		if (idade >= 65) {
			System.out.println("Pela idade o empregado está apto para aposentadoria");
		} else if (tempocasa >= 30) {
			System.out.println("Por tempo de casa empregado está apto para aposentadoria");
		}
		if (idade >= 60 && tempocasa >= 25) {
			System.out.println("Pela idade com tempo minimo de casa o empregado está apto para aposentadoria");
		}
		sc.close();
	}
}