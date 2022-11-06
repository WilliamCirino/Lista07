package tarefa07;

import java.util.Scanner;

/*14) Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos exercícios que fazem parte da avaliação. 
Calcular a média de aproveitamento, usando a fórmula abaixo e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:*/

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota do aluno");
		double nota1 = sc.nextDouble();

		System.out.println("Digite a segumda nota do aluno");
		double nota2 = sc.nextDouble();

		System.out.println("Digite a terceira nota do aluno");
		double nota3 = sc.nextDouble();

		System.out.println("Insira qual a média dos exercícios que fazem parte da avaliação");
		double media = sc.nextDouble();

		double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + media) / 7;
		System.out.println(mediaAproveitamento);

		if (mediaAproveitamento >= 9) {
			System.out.println("Conceito A");
		} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
			System.out.println("Conceito B");
		}
		if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			System.out.println("Conceito C");
		} else if (mediaAproveitamento < 6) {
			System.out.println("Conceito D");
		}
		sc.close();
	}
}