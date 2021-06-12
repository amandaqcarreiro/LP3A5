package thread;

import java.util.Scanner;

public class Caixa {
	private double saldo = 5000;
	Scanner ler  = new Scanner(System.in);
	
	public Caixa(double saldo) {
		this.saldo = saldo;
	}
	
	public synchronized double saque(double valor) {
		if(this.saldo < valor) {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente para realizar a operacao!");
		}
			
		return saldo;
		
	}
	
	public synchronized double transferencia(double valor) {
		if(this.saldo < valor) {
			this.saldo -= valor;
			System.out.println("Transferencia efetuado com sucesso!");	
		}else {
			System.out.println("Saldo insuficiente para realizar a operacao!");
		}
		
		return saldo;
		
	}
}
