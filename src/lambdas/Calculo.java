package lambdas;

@FunctionalInterface //usada para força a ter apenas um unico método dentro da interface
public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "muito lagal";
	}
}
