package minicurso.padroes.strategy.parte1;


public class CalculadorDeImpostos {
 
 public void realizaCalculo(Orcamento orcamento, String imposto){
     
    if( "ICMS".equalsIgnoreCase(imposto) ) {
      
      double icms = orcamento.getValorTotal() * 0.1;
      System.out.println(icms); 
       
  
    } else if( "ISS".equalsIgnoreCase(imposto) ) {
       
      double iss = orcamento.getValorTotal() * 0.06;
      System.out.println(iss);       
   
//    } else if ("outroImposto".equalsIgnoreCase(imposto)) {
//
//    }
  }
 }
}
