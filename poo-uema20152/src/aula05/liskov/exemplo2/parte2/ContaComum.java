package aula05.liskov.exemplo2.parte2;
public class ContaComum {

    private MovimentacaoSaldo movimentacaoSaldo;

    public ContaComum() {
        movimentacaoSaldo = new MovimentacaoSaldo();
    }

    public void deposita(double valor) {
    	// regra de negócio
        movimentacaoSaldo.deposita(valor);
        // regra de negócio
        
    }

    public void saca(double valor) {
    	// aplicar uma taxa
        movimentacaoSaldo.saca(valor);
    }

    public void somaInvestimento(){
        movimentacaoSaldo.somaInvestimento();;
    }

    public double getSaldo() {
        return movimentacaoSaldo.getSaldo();
    }

}