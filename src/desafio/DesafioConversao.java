/*
 * o metodo ".replace(agr1 , agr2)", ele troca todos os agr1 por agr2, ex: salario_01 = input.nextLine().replace(",", ".");
 * assim se o usuario digitar o valor com virgula será trocado para ponto, não quebrando o programa.
 * 
 * 
 * */


package desafio;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		String salario_01, salario_02, salario_03;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Informe o salario do trabalhador : ");
		
		salario_01 = input.nextLine().replace(",", ".");
		
		System.out.println("Informe o salario do trabalhador : ");
		
		salario_02 = input.nextLine().replace(",", ".");;
		
		System.out.println("Informe o salario do trabalhador : ");
		
		salario_03 = input.nextLine().replace(",", ".");
		
		double valor01 = Double.parseDouble(salario_01);
		double valor02 = Double.parseDouble(salario_02);
		double valor03 = Double.parseDouble(salario_03);
		
		double media = ((valor01+valor02+valor03)/3);
		System.out.println("a media de sálario é : "+media);
		
		input.close();
	}

}
