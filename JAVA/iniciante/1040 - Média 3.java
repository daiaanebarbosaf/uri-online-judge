import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
		
		double n1 = leitor.nextDouble();
		double n2 = leitor.nextDouble();	
		double n3 = leitor.nextDouble();
		double n4 = leitor.nextDouble();
		
		double media = (n1*2.0 + n2*3.0 + n3*4.0 + n4*1.0)/10.0;
		
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println("Media: " +df.format(media));
		
		if(media >= 7.0 ) {
			System.out.println("Aluno aprovado.");
		}
		
		if(media < 5.0) {
			System.out.println("Aluno reprovado.");
		}
		
		if(media <= 6.9 && media >=5.0) {
			
			System.out.println("Aluno em exame.");
			
			double notaExame = leitor.nextDouble();
			
			double media2 = (notaExame + media)/2.0;
			System.out.printf("Nota do exame: %.1f\n", notaExame);
			
			if(media2 >= 5.0) {
				System.out.println("Aluno aprovado.");
			}
			
			if(media2 <= 4.9) {
				System.out.println("Aluno reprovado.");
			}
			
			System.out.printf("Media final: %.1f\n", media2);
		}
 
    }
 
}
