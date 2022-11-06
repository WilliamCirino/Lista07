package tarefa07;

import java.util.Scanner;

/*10) Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres 
(considere que as idades dos homens serão sempre diferentes entre si, bem como as das mulheres). 
Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das 
idades do homem mais novo com a mulher mais velha.*/

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade do primeiro homem");
		int prihomem = sc.nextInt();

		System.out.println("Digite a idade do segundo homem");
		int seghomem = sc.nextInt();

		System.out.println("Digite a idade da primeira mulher");
		int primulher = sc.nextInt();

		System.out.println("Digite a idade da segunda mulher");
		int segmulher = sc.nextInt();

		int soma = prihomem + segmulher;
		int soma1 = prihomem + primulher;
		int soma2 = seghomem + primulher;
		int soma3 = seghomem + primulher;
		int mult = prihomem * primulher;
		int mult1 = prihomem * segmulher;
		int mult2 = seghomem * segmulher;
		int mult3 = seghomem * primulher;
		if (prihomem > seghomem && primulher > segmulher) {
			System.out.println(soma);
		} else if (prihomem > seghomem && segmulher > primulher) {
			System.out.println(soma1);
		}
		if (seghomem > prihomem & segmulher > primulher) {
			System.out.println(soma2);
		} else if (seghomem > prihomem && primulher > segmulher) {
			System.out.println(soma3);
		}
		if (prihomem < seghomem && primulher > segmulher) {
			System.out.println(mult);
		} else if (prihomem < seghomem && segmulher > primulher) {
			System.out.println(mult1);
		}
		if (seghomem < prihomem & segmulher > primulher) {
			System.out.println(mult2);
		} else if (seghomem < prihomem && primulher > segmulher) {
			System.out.println(mult3);
		}
		sc.close();
	}

}