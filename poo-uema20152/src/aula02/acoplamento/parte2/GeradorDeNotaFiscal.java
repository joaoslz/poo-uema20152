package aula02.acoplamento.parte2;

import java.util.List;

public class GeradorDeNotaFiscal {

//    private EnviadorDeEmail email;
//    private NotaFiscalDao dao;

    public NotaFiscal gera(Fatura fatura, List<AcaoAposGerarNota> acoes) {
    	
    	// açoes após nota
//    	email  = new EnviadorDeEmail();
//    	dao = new NotaFiscalDao();
    	// sms = new Sms();
    	// imprime = new Impressora();

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, 
        		            impostoSimplesSobreO(valor));

        // ações executadas
        for (AcaoAposGerarNota acao : acoes) {
        	acao.executa(nf);
			
		}
//        email.enviaEmail(nf);
//        dao.persiste(nf);

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
