package minicurso.padroes.strategy.parte3;

public class ISS implements Imposto {
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.06;
	}

}
