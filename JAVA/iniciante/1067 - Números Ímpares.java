import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		int contador = 1;
		
		Scanner leitor = new Scanner (System.in);
		int novoContador = leitor.nextInt();
		
		while(contador <= novoContador) {
			
			System.out.println(contador);
			contador += 2;
		
		}
  }
}
