package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		ClienteDesafio c1 = new ClienteDesafio("Joao", 30, false);
		ClienteDesafio c2 = new ClienteDesafio("Pedro", 45, true);
		ClienteDesafio c3 = new ClienteDesafio("Ana", 27, true);
		ClienteDesafio c4 = new ClienteDesafio("Nani", 21, true);
		ClienteDesafio c5 = new ClienteDesafio("Romm", 24, false);
		
		List<ClienteDesafio> clientes = Arrays.asList(c1, c2, c3, c4, c5);
		
		Predicate<ClienteDesafio> idadePromocao =
				i -> i.idade >= 25;
		Predicate<ClienteDesafio> pagamentoEmDia =
				i -> i.pagamentoEmDia;
		Function<ClienteDesafio, String> ganhadores = 
				n -> "Parabéns " + n.nome + " você ganhou um desconto";
				
		clientes.stream()
			.filter(idadePromocao)
			.filter(pagamentoEmDia)
			.map(ganhadores)
			.forEach(System.out::println);

//		clientes.stream()
//		.filter(n -> n.idade >= 25)
//		.filter(n -> n.pagamentoEmDia)
//		.map(a -> "Parabéns " + a.nome + " você ganhou um desconto")
//		.forEach(System.out::println);
//			
		
	}
}
