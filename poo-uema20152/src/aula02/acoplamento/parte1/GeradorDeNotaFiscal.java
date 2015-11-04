package aula02.acoplamento.parte1;

public class GeradorDeNotaFiscal {

    private EnviadorDeEmail email;
    private NotaFiscalDao dao;

    public NotaFiscal gera(Fatura fatura ) {
    	
    	// açoes após nota
    	email  = new EnviadorDeEmail();
    	dao = new NotaFiscalDao();
    	// sms = new Sms();
    	// imprime = new Impressora();

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, 
        		            impostoSimplesSobreO(valor));

        // ações executadas
        email.enviaEmail(nf);
        dao.persiste(nf);

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
