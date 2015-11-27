package minicurso.padroes.chainOfResponsability.parte2;

public class DescontoParaMaisDe500Reais extends Desconto {
	

	public double desconta(Orcamento orcamento) {
		
		if (orcamento.getValorTotal() > 500.0) {
				return orcamento.getValorTotal() * 0.07;
		}
		return 0;

	}



}
