import java.util.Scanner;

import webservices.CalcImpl;
import webservices.CalcImplProxy;

public class ExeClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		CalcImpl ws = new CalcImplProxy();

		try {
			double x, y, resultado;
			int num;
			String resultadoBinario;
			int op = 0;
			do {
				System.out.println("\nCalc SOAP!\n");
				System.out.println("Escolha a operação:");
				System.out.println("1-Soma");
				System.out.println("2-Subtração");
				System.out.println("3-Multiplicação");
				System.out.println("4-Divisão");
				System.out.println("5-Raiz Quadrada");
				System.out.println("6-Potência");
				System.out.println("7-Converter numero inteiro para Binário");
				System.out.println("8-Sair");

				Scanner scanner = new Scanner(System.in);
				op = scanner.nextInt();

				switch (op) {
				case 1:
					System.out.println("Digite dois numeros:");

					x = scanner.nextDouble();
					y = scanner.nextDouble();

					resultado = ws.soma(x, y);

					System.out.println(resultado);

					break;
				case 2:
					System.out.println("Digite dois numeros:");

					x = scanner.nextDouble();
					y = scanner.nextDouble();

					resultado = ws.subtracao(x, y);

					System.out.println(resultado);

					break;
				case 3:
					System.out.println("Digite dois numeros:");

					x = scanner.nextDouble();
					y = scanner.nextDouble();

					resultado = ws.multiplicacao(x, y);

					System.out.println(resultado);

					break;
				case 4:
					System.out.println("Digite dois numeros:");

					x = scanner.nextDouble();
					y = scanner.nextDouble();

					resultado = ws.divisao(x, y);

					System.out.println(resultado);

					break;
				case 5:
					System.out.println("Digite um numero:");

					x = scanner.nextDouble();

					resultado = ws.raizQuadrada(x);

					System.out.println(resultado);

					break;
				case 6:
					System.out.println("Digite o numero base:");
					x = scanner.nextDouble();

					System.out.println("Digite o numero expoente:");
					y = scanner.nextDouble();

					resultado = ws.potencia(x, y);

					System.out.println(resultado);

					break;
				case 7:
					System.out.println("Digite um numero:");
					num = scanner.nextInt();

					resultadoBinario = ws.intToBinary(num);

					System.out.println(resultadoBinario);
					break;
				case 8:
					System.exit(0);
					break;

				default:
					break;
				}
			} while (op != 8);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
