package desafio;

public class DesafiosAritimeticos {
	public static void main(String[] args) {

		int a=3,b=2,c=1,d=5,e=2,f=7;
		
		
		double somaMultipliacao = 6*(a+b);
		double potencia1 = Math.pow(somaMultipliacao, 2);
		double resultado1 = potencia1/(3*2);
		
		double subtracaoMltiplicacao = (c-d)*(e-f);
		double divisao = subtracaoMltiplicacao / 2;
		double resultado2 = Math.pow(divisao, 2);
		
		double resultado3 = (resultado1 - resultado2);
		double resultado4 = Math.pow(resultado3, 3);
		double resultafoFinal = resultado4 / Math.pow(10, 3);
		
		System.out.println(resultafoFinal);
		
	}

}
