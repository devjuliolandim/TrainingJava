package treino;

import java.util.Scanner;


public class ConversorCparaFeFparaC {

	public static void main(String[] args) {
		
	
		
		Scanner resposta = new Scanner(System.in);
		int escolha;
		
		
		do {
			
			System.out.println("Qual tipo de conversão você quer fazer?");
			System.out.println("Celsius para Farenheit - 1");
			System.out.println("Farenheit para Celsius - 2");
			escolha = resposta.nextInt();
			
				if(escolha != 1 && escolha != 2) {
					
					System.out.println("Alternativa errada! Por favor digite novamente");
					
				}
			
			
			
		}while(escolha != 1 && escolha != 2);
		
		
		
		
		double celsius;
		double farenheit;
		
		double ConversaoCelsiusParaFarenheit;
		double ConversaoFparaC;
		
			if(escolha == 1) {
				
				
				System.out.println("Qual a temperatuta em Celsius?");
				celsius = resposta.nextDouble();
				
				ConversaoCelsiusParaFarenheit = (9*celsius + 160)/5;
				
				System.out.println("O valor de "+ celsius + " em Farenheit é " + ConversaoCelsiusParaFarenheit);
				
				
				
			}else {
				
				System.out.println("Qual a temperatuta em Farenheit?");
				farenheit = resposta.nextDouble();
				
				ConversaoFparaC = (5*farenheit - 160)/9;
				
				System.out.println("O valor de " + farenheit + " em Celsius é " + ConversaoFparaC);
				
			}
		
		
		
		
		resposta.close();
	}

}
