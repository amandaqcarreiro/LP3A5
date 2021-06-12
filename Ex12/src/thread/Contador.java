package thread;

import java.util.Scanner;

public class Contador {
	private int soma;
	Scanner ler  = new Scanner(System.in);
	
	public synchronized int somaNumeros(int x, int z) {
		
		soma = 0;
		
		while(x > z) {
			System.out.println("Digite um numero menor que o segundo");
			x = ler.nextInt();
		}
		
		while(x < z) {
			x += x++;
			soma += 1;
		}
		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return soma;
		
	}
}
