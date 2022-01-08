package classe;

public class AreaCricTeste {

	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		// a1.pi = 10000000;

		// AreaCirc.PI = 3.1514;
		
		System.out.println(a1.area()); // area como metodo que pertence a instancia

		
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
	}

}
