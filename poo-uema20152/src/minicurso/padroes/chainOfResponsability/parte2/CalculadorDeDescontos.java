package minicurso.padroes.chainOfResponsability.parte2;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		
		Desconto regraDeDesconto1 = new DescontoParaMaisDe3Itens();
		Desconto regraDeDesconto2 = new DescontoParaMaisDe500Reais();
		Desconto regraDeDesconto3 = new SemDesconto();
		
		regraDeDesconto1.proximo(regraDeDesconto2);
		regraDeDesconto2.proximo(regraDeDesconto3);
		
		
		// verifica primeira regra de possível desconto
		return regraDeDesconto1.desconta(orcamento); 
		
	
	}
}
