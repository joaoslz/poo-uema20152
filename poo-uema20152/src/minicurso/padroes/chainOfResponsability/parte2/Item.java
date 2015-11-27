package minicurso.padroes.chainOfResponsability.parte2;

public class Item {

	private String nome;
	private double preco;
	private int quantidade;

	public Item(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public double getSubTotal() {
		return ( this.preco * this.quantidade );
	}

}
