package aula03.ocp_dip.parte2;

public class CalculadoraDePrecos {
	
    private TabelaDePreco tabela;
	private Frete frete;
	
	public CalculadoraDePrecos(TabelaDePreco tabela, Frete frete) {
		super();
		this.tabela = tabela;
		this.frete = frete;
	}

	public double calcula(Compra produto) {
//    	tabela = new TabelaDePrecoPadrao();
//      frete = new Correios();

        double desconto = tabela.descontoPara( produto.getValor());
        double valorFrete = frete.para( produto.getCidade() );

        return produto.getValor() * (1-desconto) + valorFrete;
    }
}

