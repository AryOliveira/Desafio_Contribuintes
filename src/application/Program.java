package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.TaxPayer;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.printf("Digite os dados do " + (i + 1) + " contribuinte:");

			System.out.print("Renda anual com salario: ");
			double salaryIncome = sc.nextDouble();			
			System.out.print("Renda anual com prestação de servico: ");
			double servicesIncome = sc.nextDouble();			
			System.out.print("Renda anual com ganho capital: ");
			double capitalIncome = sc.nextDouble();			
			System.out.print("Gastos Médicos: ");
			double healthSpending = sc.nextDouble();;			
			System.out.print("Gastos Educarionais: ");
			double educationSpending = sc.nextDouble();		
			
			
			list.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));

			}
		
		for (TaxPayer tax : list) {				
				System.out.println("Digite os dados do contribuinte:");			
				System.out.printf("Imposto Bruto total: %.2f \n " , tax.grossTax());
				System.out.printf("Abatimento: %.2f \n" , tax.taxRebate());
				System.out.printf("Imposto devido: %.2f \n" , tax.netTax());
			
			
		}		
		
		
		
	 sc.close();

	}

}
