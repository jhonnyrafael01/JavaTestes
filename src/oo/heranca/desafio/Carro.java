package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual;

	void acelerar() {
		velocidadeAtual += 5;
	}

	void frear() {
		if (this.velocidadeAtual <= 0) {
			System.out.println("Carro parado");
		} else {
			this.velocidadeAtual -= 5;
		}
	}

	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "km/h";
	}
}
