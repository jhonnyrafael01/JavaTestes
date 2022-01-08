package classe.desafio;

public class Pessoa {

	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.pesoComida;
		}
	}
	
	String aprensentar() {
		return "Olá eu sou " + nome + " e tenho " + peso + " Kgs.";
	}

}
