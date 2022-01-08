package classe;

public class Vetor {

	public static void main(String[] args) {
		
		int [] a  = new int[5];
		
		a[0] = 10;
		a[1] = 5;
		a[2] = 12;
		a[3] = 20;
		a[4] = 50;
		
		for (int b : a) {
			System.out.println(b);
		}
		
	}
}
