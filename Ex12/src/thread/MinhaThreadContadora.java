package thread;

import java.util.Scanner;

public class MinhaThreadContadora implements Runnable {

	private String nome;
	private int x, z, soma;
	private static Contador cont = new Contador();
	
	public MinhaThreadContadora(String nome, int x, int z) {
		this.nome = nome;
		this.x = x;
		this.z = z;
		new Thread(this, nome).start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.nome + " iniciada");
		
		soma = cont.somaNumeros(x, z);
		
		System.out.println("X: " +x+ " Z: " +z+ " Resultado: " +soma);
		
	}

}
