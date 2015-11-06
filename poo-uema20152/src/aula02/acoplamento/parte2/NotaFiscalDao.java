package aula02.acoplamento.parte2;

public class NotaFiscalDao implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Salva a nota fiscal...");
		
	}
}

