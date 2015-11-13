package aula05.liskov.exemplo2.parte2;

public class ContaUniversitaria  {

    private int milhas;
    private MovimentacaoSaldo movimentacaoSaldo;
    
    public ContaUniversitaria() {
    	this.movimentacaoSaldo = new MovimentacaoSaldo();
	}

    public void deposita(double valor) {
        movimentacaoSaldo.deposita(valor);;
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }
    
//    @Override
//    public void somaInvestimento() {
//    	throw new RuntimeException("Não pode ter investimento!!");
//    }
}

