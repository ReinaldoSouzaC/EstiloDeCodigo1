package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Metod;

public class Inss {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Salário por hora: ");
		double hora = sc.nextDouble();
		System.out.print("Quantas horas trabalhadas: ");
		double horasTrabalho = sc.nextDouble();
		System.out.print("INSS: ");
		double inss = sc.nextDouble();
		Metod met = new Metod(hora, horasTrabalho, inss);
		
		double salario = met.salario();
		double salarioliquido = met.liquido();
		
		System.out.println();
		System.out.println("Salario: " + salario);
		System.out.println("Salario liquido: " + salarioliquido);
		
		sc.close();
	}
}
