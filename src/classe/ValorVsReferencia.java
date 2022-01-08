package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a; // atribuição por valor (Tipo primitivo)

		a++;
		b--;
		System.out.println(a + "    " + b);

		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referência (Objeto)
		d1.dia = 31;
		d2.mes = 12;

		d1.ano = 2025;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		aoltarDataParaValorPadrao(d1);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);

	}

	// referencia o endereço de memoria, ou seja muda o valor de todos 
	static void aoltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	// não tem impacto pois é alterado somente uma copia e não o valor original (refernecia em memoria)
	static void alterarPrimitivo(int a) {
		a++;
	}

}
