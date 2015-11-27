package minicurso.padroes.strategy.parte3;

public class ICMS implements Imposto {
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.1;
	}

}
