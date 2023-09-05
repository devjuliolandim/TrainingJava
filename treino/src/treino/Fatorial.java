package treino;

import java.util.Scanner;

public class Fatorial {

	public static void fatorial(int num) {

		if (num == 0 || num == 1) {

			System.out.println("O fatorial de "+ num +" é 1");

		} else {

			int fatorial = 1;

			for (int i = num; i > 0; i--) {

				fatorial *= i;

			}

			System.out.println("O fatorial de "+num +" é " +fatorial);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o número que você deseja saber o fatorial?");

		int num;

		do {
			num = scanner.nextInt();

			if (num < 0) {

				System.out.println("Números abaixo de zero não são permitidos");

			}

		} while (num < 0);

		fatorial(num);

		scanner.close();
	}

}
