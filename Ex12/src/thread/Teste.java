package thread;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, z;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		x = ler.nextInt();
		
		System.out.println("Digite outro numero: ");
		z = ler.nextInt();
		
		MinhaThreadContadora t1 = new MinhaThreadContadora("#1", x, z);

	}

}
