package aula05.liskov.exemplo1.parte1;

public class RetanguloFactory {
	
	public static Retangulo getRetangulo() {
		// codigo
		// if alguma condicao
		return  new Quadrado();
	}

}
