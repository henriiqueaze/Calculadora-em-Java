package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;
import exceptions.NumberException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Primeiro número: ");
			double n1 = input.nextDouble();
			input.nextLine();
	
			System.out.print("Segundo número: ");
			double n2 = input.nextDouble();
			input.nextLine();
	
			Calculator calculadora = new Calculator(n1, n2);
			
			while (true) { 
				System.out.println("[1] - Soma\n[2] - Subtração\n[3] - "
						+ "Mulitplicação\n[4] - Divisão\n[5] - Sair");
				System.out.print("Alternativa: ");
				int resposta = input.nextInt();
	
				switch (resposta) {
				case 1:
					System.out.printf("Resposta: %.2f\n", calculadora.addition()); 
					break;
					
				case 2:
					System.out.printf("Resposta: %.2f\n", calculadora.subtraction()); 
					break;
					
				case 3:
					System.out.printf("Resposta: %.2f\n", calculadora.multiplicate()); 
					break;
	
				case 4:
					System.out.printf("Resposta: %.2f\n", calculadora.division()); 
					break;
					
				case 5:
					System.out.println("Até logo");
					System.exit(0);
					break;
				
				}

			}
		}
		
		catch (InputMismatchException e) {
			System.out.println("Erro: Coloque um número, não um caratere");
		}

		catch (NumberException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println("ERRO");
		}
		
		finally {
			input.close();
		}
	}

}
