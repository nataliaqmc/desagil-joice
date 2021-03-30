package br.edu.insper.desagil.joice.model;

import br.edu.insper.desagil.joice.model.Calculadora;

public class CalculadoraCFC extends Calculadora{
	private double densidade;

	public CalculadoraCFC() {
		super("CFC");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double avogrado = 6.023 * Math.pow(10, 23);
		double massa = 4*peso;
		double volume = Math.pow((2*raio*Math.sqrt(2)),3);
		this.densidade = (massa/(volume*avogrado))*Math.pow(10, 21);
		return this.densidade;
	}
}