package minicurso.padroes.chainOfResponsability.parte2;

public class DescontoParaMaisDe3Itens extends Desconto {
	
	public double desconta(Orcamento orcamento) {
		
		if (orcamento.getQuantidadeDeItens() > 3) {
			return orcamento.getValorTotal() * 0.10;
		}
		return proximo.desconta(orcamento);

	}

}
