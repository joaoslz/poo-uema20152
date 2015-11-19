package aula05.liskov.exemplo2.parte2;

class MovimentacaoSaldo {
	
	 protected double saldo;

	    MovimentacaoSaldo() {
			this.saldo = 0;
	    }

	     void deposita(double valor) {
	        this.saldo += valor;
	    }

	    void saca(double valor) {
	        if (valor <= this.saldo) {
	            this.saldo -= valor;
	        } else {
	            throw new IllegalArgumentException();
	        }
	    }

	    void somaInvestimento(){
	        this.saldo += this.saldo * 0.01;
	    }

	    double getSaldo() {
	        return saldo;
	    }

}
