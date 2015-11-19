package aula05.liskov.exemplo2.parte2;

public class ContaUniversitaria implements OperacoesPadroesEmConta  {

    private int milhas;
    private MovimentacaoSaldo movimentacaoSaldo;
    
    public ContaUniversitaria() {
    	this.movimentacaoSaldo = new MovimentacaoSaldo();
	}

    @Override
	public void deposita(double valor) {
        movimentacaoSaldo.deposita(valor);;
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }
    
    void saca(double valor) {
    	// aplicar uma taxa
    	movimentacaoSaldo.saca(valor);
    }
    
    @Override
	public double getSaldo() {
    	return movimentacaoSaldo.getSaldo();
    }
    
//    @Override
//    public void somaInvestimento() {
//    	throw new RuntimeException("Não pode ter investimento!!");
//    }
}

