package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de notas: ");
		
		int quantidadeNotas = entrada.nextInt();
		
		double notas[] = new double[quantidadeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();			
		}
		
		double notaSoma = 0;
		for (double nota : notas) {
			notaSoma += nota;
			
		}
		double media = notaSoma / notas.length;
		System.out.println("Média: " + media );
		
		
		
		
		
		
		
		
		entrada.close();
	}

}
