package entities;

public class Calculos {

	public double n1;
	public double n2;
	public int operacao;
	


	public double soma() {
		return n1 + n2;
	}
	
	public double subtracao() {
		return n1 - n2;
	}
	
	public double multiplicacao() {
		return n1 * n2;
	}
	
	public double divisao() {
		return n1 / n2;
	}
	
	public double potenciacao() {
		return Math.pow(n1, n2);
	}
	
	public double raizquad() {
		return Math.sqrt(n1);
	}
	
	public double porcentagem() {
		return (n1 / 100) * n2;
	}
	

}
	
	
