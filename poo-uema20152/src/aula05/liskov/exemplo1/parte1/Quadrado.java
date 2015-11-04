package aula05.liskov.exemplo1.parte1;

public class Quadrado extends Retangulo {
	
	@Override
	public void setAltura(int altura) {
		this.altura = altura;
		this.largura = altura;
	}
	
	@Override
	public void setLargura(int largura) {
		this.largura = largura;
		this.altura = largura;
	}
	
	@Override
	public int calculaArea() {
		return this.altura * this.largura;
	}
	

}
