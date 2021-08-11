package traducao;

import java.util.Scanner;

public class Main {
	
	/*Elabore um algoritmo que calcule a média de 4 notas e informe se o aluno passou ou não.
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner lerNotas = new Scanner(System.in);

		System.out.println("Digite a nota 1: ");
		Double nota1 = lerNotas.nextDouble();

		System.out.println("Digite a nota 2: ");
		Double nota2 = lerNotas.nextDouble();

		System.out.println("Digite a nota 3: ");
		Double nota3 = lerNotas.nextDouble();

		System.out.println("Digite a nota 4: ");
		Double nota4 = lerNotas.nextDouble();

		Double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A sua média é: " + media);

		if (media >= 5) {
			System.out.println("Passou de ano!");
		} else {
			System.out.println("Recuperação!");
		}

	}

}
