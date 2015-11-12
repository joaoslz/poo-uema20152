package aula01.coesao_SRP.parte2;

public class CalculadoraDeSalario {


    public double calcula(Funcionario funcionario) {
//    	funcionario.getCargo().getRegra().calcula(funcionario);
    	return funcionario.calcula();
    	
//       
//    	if(Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
//            return new BonificacaDeDezOuVintePorCento().calcula(funcionario);
//        }
//
//        if(Cargo.DBA.equals(funcionario.getCargo()) || Cargo.TESTER.equals(funcionario.getCargo())) {
//            return new BonificacaoDeQuinzeOuVinteCincoPorCento().calcula(funcionario);
//        }
//
//        throw new RuntimeException("funcionario invalido");
    }

//    private double outraRegra(Funcionario funcionario) {
//    	return 0;
//    }
//
}

