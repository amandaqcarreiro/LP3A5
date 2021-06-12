package thread;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String frase;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua frase:");
        
        frase = ler.nextLine();
        
        frase = frase.toLowerCase();
        
		MinhaThreadFrase t1 = new MinhaThreadFrase("#1", frase);
		
		
	}

}
