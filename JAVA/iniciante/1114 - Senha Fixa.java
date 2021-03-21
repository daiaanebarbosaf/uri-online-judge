import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
 		Scanner leitor = new Scanner(System.in);
		
		int senhaFixa = 0; 
		
		do {
			senhaFixa = leitor.nextInt();
			if(senhaFixa != 2002) {
				System.out.println("Senha Invalida");
			}
			
		}while(senhaFixa != 2002);
		
		System.out.println("Acesso Permitido");
 
    }
 
}
