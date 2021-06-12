package thread;

import java.util.Scanner;

public class Calculadora {
	private int resultado, num1, num2;
	
	Scanner ler = new Scanner(System.in);
	
	public synchronized int soma() {
		resultado = 0;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		resultado = num1+num2;
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		return resultado;
		
	}
	
	public synchronized int subtracao() {
		resultado = 0;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		resultado = num1-num2;
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		return resultado;
		
	}
	
	public synchronized int multiplicacao() {
		resultado = 0;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		resultado = num1*num2;
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		return resultado;
		
	}
	
	public synchronized int divisao() {
		resultado = 0;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		resultado = num1/num2;
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		return resultado;
		
	}
	
}
