import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner leitor = new Scanner(System.in);

		int ho = leitor.nextInt();
		
		for (int contador = 1; contador < ho; contador++) {
			System.out.print("Ho ");
		}
		
	    System.out.println("Ho!");
 
    }
 
}
