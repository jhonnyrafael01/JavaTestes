package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o nome do dia: ");

		String dia = entrada.next();

		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println("dia 1");
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println("dia 2");
		} else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
			System.out.println("dia 3");
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("dia 4");
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println("dia 5");
		} else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println("dia 6");
		} else if ("sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
			System.out.println("dia 7");
		} else {

			System.out.println("dia invalido");
		}

		entrada.close();

	}
}
