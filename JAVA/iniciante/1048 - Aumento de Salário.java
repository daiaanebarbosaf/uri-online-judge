
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
		
		double salario = leitor.nextDouble();
		
		if(salario >= 0 && salario <= 400.00) {
			
			double porcentagem1 = (15.0/100.0) * salario;
			double  total1 = porcentagem1 + salario;
			
			System.out.printf("Novo salario: %.2f\n", total1);
			System.out.printf("Reajuste ganho: %.2f\n", porcentagem1);
			System.out.println("Em percentual: 15 %");
		}
		
		if(salario >= 400.01 && salario <= 800.00) {
			
			double porcentagem2 = (12.0/100.0) * salario;
			double  total2 = porcentagem2 + salario;
			
			System.out.printf("Novo salario: %.2f\n", total2);
			System.out.printf("Reajuste ganho: %.2f\n", porcentagem2);
			System.out.println("Em percentual: 12 %");
			
		}
		
		if(salario >= 800.01 && salario <= 1200.00) {
			
			double porcentagem3 = (10.0/100.0) * salario;
			double  total3 = porcentagem3 + salario;
			
			System.out.printf("Novo salario: %.2f\n", total3);
			System.out.printf("Reajuste ganho: %.2f\n", porcentagem3);
			System.out.println("Em percentual: 10 %");
			
		}
		
		if(salario >= 1200.01 && salario <= 2000.00) {
			
			double porcentagem4 = (7.0/100.0) * salario;
			double  total4 = porcentagem4 + salario;
			
			System.out.printf("Novo salario: %.2f\n", total4);
			System.out.printf("Reajuste ganho: %.2f\n", porcentagem4);
			System.out.println("Em percentual: 7 %");
			
		}
		
		if(salario > 2000.00) {
			
			double porcentagem5 = (4.0/100.0) * salario;
			double  total5 = porcentagem5 + salario;
			
			System.out.printf("Novo salario: %.2f\n", total5);
			System.out.printf("Reajuste ganho: %.2f\n", porcentagem5);
			System.out.println("Em percentual: 4 %");
			
		}
 
    }
 
}
