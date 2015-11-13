package aula03.ocp_dip.parte2;

public class Correios implements Frete {
	
    @Override
	public double para(String cidade) {
        
    	if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}