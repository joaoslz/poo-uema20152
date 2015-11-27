package minicurso.padroes.strategy.parte2;


public class CalculadorDeImpostos {
 
 public void realizaCalculo(Orcamento orcamento, String imposto){
     
    if( "ICMS".equalsIgnoreCase(imposto) ) {
      
      double icms = new ICMS().calcula(orcamento);
      System.out.println(icms); 
       
  
    } else if( "ISS".equalsIgnoreCase(imposto) ) {
       
      double iss = new ISS().calcula(orcamento);
      System.out.println(iss);       
   
//    } else if ("outroImposto".equalsIgnoreCase(imposto)) {
//
//    }
  }
 }
}
