package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "#";
//		for (int i = 1; i < 5; i++) {
//			System.out.println(valor);
//			valor+="#";
//		}
		
		// Versão do desafio
		// Não pode usar valor numerico para controlar o laço!
		
		for (String contador = "#"; !contador.equals("######"); contador+="#") {
			System.out.println(contador);
		}
	}

}
