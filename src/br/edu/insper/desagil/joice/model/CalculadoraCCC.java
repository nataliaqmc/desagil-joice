package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {
	private double densidade;
	
	public CalculadoraCCC() {
		super("CCC");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double avogrado = 6.023 * Math.pow(10, 23);
		double massa = 2*peso;
		double volume = Math.pow(((4*raio)*Math.sqrt(3)/3),3);
		this.densidade = (massa/(volume*avogrado))*Math.pow(10, 21);
		return this.densidade;
	}
}