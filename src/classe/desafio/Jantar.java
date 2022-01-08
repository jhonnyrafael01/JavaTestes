package classe.desafio;

public class Jantar {

	public static void main(String[] args) {

		Comida c1 = new Comida("Arroz com Feijão", 0.500);
		Comida c2 = new Comida("Baião", 0.750);

		Pessoa p = new Pessoa("rafael", 60);

		System.out.println(p.aprensentar());
		p.comer(c1);
		
		System.out.println(p.aprensentar());
		p.comer(c2);

		System.out.println(p.aprensentar());
	}

}
