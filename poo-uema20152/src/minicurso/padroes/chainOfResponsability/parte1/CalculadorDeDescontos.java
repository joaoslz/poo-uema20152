package minicurso.padroes.chainOfResponsability.parte1;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
	
		// verifica primeira regra de possível desconto
		if (orcamento.getQuantidadeDeItens() > 3) {
			return orcamento.getValorTotal() * 0.10;
		}

		// verifica segunda regra de possível desconto
		else if (orcamento.getValorTotal() > 500.0) {
			return orcamento.getValorTotal() * 0.07;
		}

		// verifica terceira, quarta, quinta regra de
		// possível desconto ...
		// um monte de ifs daqui pra baixo
		return 0;
	}
}
