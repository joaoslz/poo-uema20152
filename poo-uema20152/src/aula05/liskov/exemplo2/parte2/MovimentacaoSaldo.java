package aula05.liskov.exemplo2.parte2;

public class MovimentacaoSaldo {
	
	 protected double saldo;

	    public MovimentacaoSaldo() {
			this.saldo = 0;
	    }

	    public void deposita(double valor) {
	        this.saldo += valor;
	    }

	    public void saca(double valor) {
	        if (valor <= this.saldo) {
	            this.saldo -= valor;
	        } else {
	            throw new IllegalArgumentException();
	        }
	    }

	    public void somaInvestimento(){
	        this.saldo += this.saldo * 0.01;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

}
