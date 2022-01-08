package desafio;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho2 = true;
		boolean trabalho1 = true;
		
		if(trabalho1 && trabalho2) {
			System.out.println("TV 50");
			System.out.println("Tomar sorvete");
		}else if(trabalho1 ^ trabalho2) {
			System.out.println("TV 32");
			System.out.println("Tomar sorvete");
		}else {
			System.out.println("ficar em casa");
			
		}
		
		
		
		
		
	}
}
