package thread;

import static java.lang.Thread.sleep;

public class Caixa {
	private double saldo;
	public static boolean caixaVazio = true;
	
	public Caixa(double saldo) {
		this.saldo = saldo;
	}
	
	public synchronized double abastecerCaixa(double valor) {
		this.saldo += valor;

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        caixaVazio = false;
        notifyAll();
  
		return valor;
	}
	
	public synchronized double saque(double valor) {
		try {
    		while(caixaVazio)
    			wait();
    		sleep(8000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

		if(this.saldo < valor) {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente para realizar a operacao!");
		}
		
		notifyAll();
			
		return saldo;
		
	}
	
	public synchronized double transferencia(double valor) {
		try {
    		while(caixaVazio)
    			wait();
    		sleep(8000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
		
		if(this.saldo < valor) {
			this.saldo -= valor;
			System.out.println("Transferencia efetuado com sucesso!");	
		}else {
			System.out.println("Saldo insuficiente para realizar a operacao!");
		}
		
		notifyAll();
		
		return saldo;
		
	}
}
