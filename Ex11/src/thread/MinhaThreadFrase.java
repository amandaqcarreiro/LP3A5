package thread;
import java.util.Scanner;

import thread.Calculadora;

public class MinhaThreadFrase implements Runnable {
	private String nome, frase;
	private int vogais, consoantes;
	private static Calculadora calc = new Calculadora();
	
	public MinhaThreadFrase(String nome, String frase) {
		this.nome = nome;
		this.frase = frase;
		new Thread(this, nome).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.nome + " iniciada");
		
		vogais = calc.somaVogais(frase);
		consoantes = calc.somaConsoantes(frase);
		System.out.println("A frase possui " +vogais+ " vogais e " +consoantes+ " consoantes");
		
	}

}
