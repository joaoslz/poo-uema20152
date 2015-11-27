package minicurso.padroes.strategy.parte1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrcamentoTest {

	private Orcamento orcamento;

	@Before
	public void setup() {
		orcamento = new Orcamento();
	}
	
	@Test
	public void deveAdicionarUmItemNoOrcamento() {
		orcamento.adicionaItem(new Item("Tablet", 600.0, 1));
	}

	@Test
	public void deveCalcularValorTotalNUmOrcamentoVazio() {
		double valorEsperado = 0;
		assertEquals(valorEsperado, orcamento.getValorTotal(), 0.000001);
	}

	@Test
	public void deveCalcularValorTotalNUmOrcamentoComItens() {
		orcamento.adicionaItem(new Item("Tablet", 600.0, 1));
		orcamento.adicionaItem(new Item("Notebook", 1000.0, 2));

		double valorEsperado = 2600.0;
		assertEquals(valorEsperado, orcamento.getValorTotal(), 0.000001);
	}

}
