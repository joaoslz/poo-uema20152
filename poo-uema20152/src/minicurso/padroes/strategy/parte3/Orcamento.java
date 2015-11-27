package minicurso.padroes.strategy.parte3;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	List<Item> itens = new ArrayList<>();
	
	public void adicionaItem(Item item) {
		itens.add(item);
		
	}

	public double getValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total = total + item.getSubTotal();
		}
		return total;
	}

}
