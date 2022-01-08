package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
	
		Produto p1 = new Produto("Notbook", 4356.89);
		
		var p2 =  new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
	
		Produto.desconto = 0.5;

		System.out.println(p1.nome+ " " + p1.precoComDesconto());
		System.out.println(p2.nome+ " " + p2.precoComDesconto());
		double procoFinal1 = p1.precoComDesconto();
		double procoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (procoFinal1 + procoFinal2) / 2;

		
		System.out.printf("Média do carrinho = R$%.2f",mediaCarrinho);
	}

}
