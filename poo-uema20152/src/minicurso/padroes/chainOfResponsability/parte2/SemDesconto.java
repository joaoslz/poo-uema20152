package minicurso.padroes.chainOfResponsability.parte2;

public class SemDesconto extends Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

}
