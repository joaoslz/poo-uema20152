package minicurso.padroes.strategy.parte2;

public class ICMS {
	
	public double calcula(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.1;
	}

}
