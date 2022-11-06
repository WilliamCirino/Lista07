package tarefa07;

import java.util.Scanner;

/*12) Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem 
‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta 
(a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.*/

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o código de usuário");
		int codigo = sc.nextInt();

		if (codigo == 1234) {
			System.out.println("Informe a senha:");
		} else {
			System.out.println("Usuário Inválido!");
		}
		int senha = sc.nextInt();
		if (senha == 9999) {
			System.out.println("Acesso Permitido!");
		} else {
			System.out.println("Senha Incorreta!");
		}
		sc.close();
	}
}