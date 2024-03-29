import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double n1, n2;
		byte resposta;
		System.out.print("Digite os valores que deseja calcular: ");
		n1 = input.nextDouble();
		n2 = input.nextDouble();

		System.out.print("[1] - Adição\n[2] - Subtração\n[3] - " + "Multiplicação\n[4] - Divisão\nResposta: ");
		resposta = input.nextByte();
		
		input.close();

		switch (resposta) {
		case 1:
			double soma;
			soma = n1 + n2;
			System.out.printf("A soma dos números %.2f e %.2f é igual a %.2f", n1, n2, soma);
			break;

		case 2:
			double subtracao;
			subtracao = n1 - n2;
			System.out.printf("A subtração dos números %.2f e %.2f é igual a %.2f", n1, n2, subtracao);
			break;

		case 3:
			double multiplicacao;
			multiplicacao = n1 * n2;
			System.out.printf("A multiplicação dos números %.2f e %.2f é igual a %.2f", n1, n2, multiplicacao);
			break;

		case 4:
			double divisao;
			divisao = n1 / n2;
			System.out.printf("A divisão dos números %.2f e %.2f é igual a %.2f", n1, n2, divisao);
			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}

	}

}
