package minicurso.padroes.chainOfResponsability.parte2;

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

	public List<Item> getItens() {
		return this.itens;
	}

	public int getQuantidadeDeItens() {
		return itens.size();
	}

}
