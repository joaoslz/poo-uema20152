package aula01.coesao_SRP.parte2;

public enum Cargo {
    DESENVOLVEDOR (new BonificacaDeDezOuVintePorCento()),
    DBA ( new BonificacaoDeQuinzeOuVinteCincoPorCento() ) ,
    TESTER (new BonificacaoDeQuinzeOuVinteCincoPorCento());
    
    
     private RegraDeCalculoDeBonificacaoIF regra;

	Cargo(RegraDeCalculoDeBonificacaoIF regra) {
		this.regra = regra;
     }
	
	public RegraDeCalculoDeBonificacaoIF getRegra() {
		return regra;
	}
    
}




