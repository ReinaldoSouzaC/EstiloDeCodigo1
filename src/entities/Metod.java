package entities;

public class Metod {

	private double shoras;
	private double horasTrabalho;
	private double inss;
	
	public Metod(double horas, double horasTrabalho, double inss) {
		this.shoras = horas;
		this.horasTrabalho = horasTrabalho;
		this.inss = inss;
	}
	public double salario() {
		return shoras * horasTrabalho;
	}
	public double liquido() {
		return salario() - salario() * inss / 100;
	}
	public String toString() {
		return "Salario: $"
				+ String.format("%.2f%n", salario())
				+ "Liquido: $"
				+ String.format("%.2f%n", liquido());
	}
}
