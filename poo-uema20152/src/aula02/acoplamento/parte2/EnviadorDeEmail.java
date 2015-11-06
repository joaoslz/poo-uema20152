package aula02.acoplamento.parte2;
public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
    void executa(NotaFiscal nf) {
    	System.out.println("Enviando a nf por email ...");
    	
    }
}

