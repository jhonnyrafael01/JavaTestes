package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int contador = 0;
		double nota = 0, soma = 0;

		System.out.println("Digite -1 para encerrar e calcular a media");

		while (nota != -1) {
			System.out.println("digite a nota");
			nota = entrada.nextDouble();
			if (nota <= 10 && nota >= 0) {
				contador++;
				soma += nota;
			} else if(nota == -1){
				System.out.println("Obrigado!");
			}else {
				System.out.println("informe uma nota valida");
			}
		}

		// calcular a media
		double resultado = soma / contador;

		System.out.println("a media é: " + resultado);
		entrada.close();

	}

}
