package desafio;

import java.util.Scanner;

public class DasafioCalculadora {
	public static void main(String[] args) {
		// ler num1
		// ler num2
		// + - * / %
		String numero1 , numero2 ;
		System.out.println("calculadora maluca");

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primero numero ");
		numero1 = scan.nextLine();
		
		System.out.println("Digite o primero numero ");
		numero2 = scan.nextLine();
		
		System.out.println("informe o tipo de operação: + - * / % ");
		String tipo = scan.next();
		
		double valor1 = Double.parseDouble(numero1);
		double valor2 = Double.parseDouble(numero2);

		
		double resultado = tipo.equals("+") ? valor1 + valor2: 0; 
		resultado = tipo.equals("-") ? valor1 - valor2: resultado; 
		resultado = tipo.equals("*") ? valor1 * valor2: resultado; 
		resultado = tipo.equals("/") ? valor1 / valor2: resultado; 
		resultado = tipo.equals("%") ? valor1 % valor2: resultado; 

		System.out.printf("%.2f %s %.2f = %.2f", valor1, tipo, valor2, resultado);
		
		scan.close();
		
	}

}
