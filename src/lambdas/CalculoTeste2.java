package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> { return x + y; };
		System.out.println(calc.executar(2, 3));

		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
	}
}

/* Usando a funcção lambda se torna mais 'simples' o código, pois não precisa criar uma classe
 * e implementar a logica nela para depois estaciala em uma outra classe
 * */
 