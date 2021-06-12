package thread;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        MinhaThreadCliente transferir = new MinhaThreadCliente("transferir", 100.00);
        MinhaThreadCliente saque = new MinhaThreadCliente("saque", 200.00);
        MinhaThreadCliente saque1 = new MinhaThreadCliente("saque", 100.00);
        MinhaThreadCliente transferir1 = new MinhaThreadCliente("transferir", 100.00);
        MinhaThreadCliente recarga = new MinhaThreadCliente("recarga", 2000.00);

	}

}
