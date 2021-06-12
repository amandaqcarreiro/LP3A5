package thread;
import java.util.Scanner;

public class Calculadora {
	private int vogais = 0, consoantes = 0;
	Scanner ler = new Scanner(System.in);
	
	public synchronized int somaVogais(String frase) {
		vogais = 0;
        
		for (int i = 0; i<frase.length(); i++) {
			char c = frase.charAt(i);
			
				if(c == 32) 
					continue;
			
		        if(c == 97 || c == 101 || c == 105 || c == 111 || c == 117){
		            vogais++;
		            continue;
		        }
		        
	        
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		return vogais;
		
	}
	
	public synchronized int somaConsoantes(String frase) {
		consoantes = 0;
        
        for (int i = 0; i<frase.length(); i++) {
        	char c = frase.charAt(i);
        	
        	if(c == 32) 
        		continue;
        	
        	if(c >= 98 && c <= 122) 
	        	consoantes++;
        }
		
		return consoantes;
		
	}
	
}
