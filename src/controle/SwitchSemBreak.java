package controle;


public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "laranja";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("sei o Bassai-Dai...");
		case "marrom":
			System.out.println("sei o Tekki shodan");
		case "roxa":
			System.out.println("sei o Heian Godan");
		case "verde":
			System.out.println("sei o Heian Yodan");
		case "laranja":
			System.out.println("sei o Heian Sandan");
		case "vermelha":
			System.out.println("sei o Heian Nidan");
		case "amarela":
			System.out.println("sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei de nada");
		}
		System.out.println("Fim\n");
		
		int idade = 3;
		switch (idade) {
		case 3:
			System.out.println("Sabe progamar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
		
		
	}

}
