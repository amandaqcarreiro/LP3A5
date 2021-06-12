package thread;

public class MinhaThreadCliente implements Runnable {
	
	private String op;
	private static double valor;
	private static Caixa caixa = new Caixa(valor);
	
	public MinhaThreadCliente(String op) {
		this.op = op;
        new Thread(this).start();
	}
	
	public MinhaThreadCliente(String op, double valor) {
		this.op = op;
		this.valor = valor;
        new Thread(this).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
    		if (op.equalsIgnoreCase("saque"))
                caixa.saque(valor);
    		else
    			caixa.transferencia(valor);
    	} catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

	}

}
