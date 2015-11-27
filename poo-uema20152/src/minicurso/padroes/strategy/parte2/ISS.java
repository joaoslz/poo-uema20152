package minicurso.padroes.strategy.parte2;

public class ISS {
	
	public double calcula(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.06;
	}

}
