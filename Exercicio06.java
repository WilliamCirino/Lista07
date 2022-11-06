package tarefa07;
/* 6) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor. 
Caso não haja vencedor deverá ser impressa a palavra EMPATE.*/
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do primeiro time");
		String time1 = sc.next();

		System.out.println("Digite quantos gols fez o primeiro time");
		int golsTime1 = sc.nextInt();

		System.out.println("Digite o nome do segundo time");
		String time2 = sc.next();

		System.out.println("Digite quantos gols fez o segundo time");
		int golsTime2 = sc.nextInt();
		
		
		if (golsTime1 > golsTime2) {
			System.out.println("O vencedor da partida foi: " + time1);
		} else if (golsTime2 > golsTime1) {
			System.out.println("O vencedor da partida foi: " + time2);
		}
		if (golsTime1 == golsTime2) {
			System.out.println("A partida terminou Empatada");
		}
		sc.close();
	}

}