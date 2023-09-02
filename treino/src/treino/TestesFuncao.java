package treino;

import java.util.Scanner;

public class TestesFuncao {

	
	public static void fatorial(int a) {
		if(a==1 || a==0) {
		System.out.println("O fatorial de "+ a + " é 1");				
			
		}else {
		//a == 4;
		
			int multi= 1;
			
			
			for(int i = a; i>0; i--) {
			multi *= i;
			
			
			}
			
			System.out.println("O fatorial de " + a + " é "+multi);
			
			
		}
				
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		
		do {
		
		System.out.println("Digite um número positivo para ser calculado o fatorial:");
		
		num = scanner.nextInt();
		
		if(num<0) {
			
			System.out.println("Por favor digite um número positivo");
			
		}
		
		
		}while( num < 0);
		
		
		
		fatorial(num);
		
		
		scanner.close();
	}

}
