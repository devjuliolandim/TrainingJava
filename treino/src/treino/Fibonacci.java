package treino;

import java.util.Scanner;

public class Fibonacci {

	public static void fibonacci(int num) {

		int a = 0;
		int b = 1;
		int c = 0;

		System.out.print("0, 1, ");
		for (int i = 0; i < (num - 2); i++) {
			c = a + b;
			a = b;
			b = c;

			if (i + 3 == num) {
				System.out.println(c + "...");

			} else {

				System.out.print(c + ", ");
			}

		}

		System.out.println("\n" + "O número na posição " + num + " é o " + c);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual a posição do número que você gostaria de saber da sequência de Fibonacci?");
		int posicao;

		do {
			posicao = scanner.nextInt();
		} while (posicao <= 0);

		fibonacci(posicao);

		scanner.close();
	}

}
