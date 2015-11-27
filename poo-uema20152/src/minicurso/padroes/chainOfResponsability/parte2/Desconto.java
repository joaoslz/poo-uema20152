package minicurso.padroes.chainOfResponsability.parte2;

public abstract class Desconto {

	protected Desconto proximo;

	public abstract double desconta(Orcamento orcamento);
	
	public void proximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
