package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2"=="2");

		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine(); // .next() tira o espaços em branco e nextLine não
		System.out.println("2" == s2.trim()); // .trim() retira os espaços em branco do Scanner
		System.out.println("2".equals(s2.trim())); // .equals compara as string se são iguais
	
		
		entrada.close();
		
		
	}

}
