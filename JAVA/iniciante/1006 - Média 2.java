import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner leitor = new Scanner(System.in);
		
		double a = leitor.nextDouble();
		double b = leitor.nextDouble();
		double c = leitor.nextDouble();
		
		double media = (a * 2.0 + b * 3.0 + c * 5.0)/(2.0 + 3.0 + 5.0);
		
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println("MEDIA = " + df.format(media));

 
    }
 
}
