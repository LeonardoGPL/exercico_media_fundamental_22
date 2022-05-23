package calculo_media_fundamental;

import java.util.Scanner;

public class mediaal {

	public static void main(String[] args) {
		Scanner batman = new Scanner(System.in);
		// inserindo dados as variaveis
		int ra, p1 = 0, p2 = 0, p3 = 0;
		// criando laco de repeticao
		do {
			// printando na tela o texto em parentese
			System.out.println("Digite seu r.a:");
			// atribuindo um valor que o usuario digitou
			ra = batman.nextInt();
			// inserindo condicao se for igual a 0
			if (ra == 0) {
				System.out.println("r.a invalido, por favor tente novamente");

				// se a condicao for negativa printar na tela
			} else {
				System.out.println("Digite a nota da Primeira Prova:");
				p1 = batman.nextInt();
				System.out.println("\nDigite a nota da Segunda Prova:");
				p2 = batman.nextInt();
				System.out.println("\nDigite a nota da Terceira Prova:");
				p3 = batman.nextInt();
			}
			// finalizando o laco de repeticao
		} while (ra == 0);
		// atribuindo valor para m
		float m = (p1 + p2 + p3) / 3;
		// inserindo condicao
		if (m >= 8) {
			System.out.println("Voce foi Aprovado!");
		} else if (m < 8 && m > 6) {
			System.out.println("Voce precisa fazer a Recuperação!");
		} else if (m <= 6) {
			System.out.println("Voce esta de Recuperacao!");
		}
		// terminar o scanner
		batman.close();

	}
}
