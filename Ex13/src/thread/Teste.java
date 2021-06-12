package thread;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
        MinhaThreadCliente saque1 = new MinhaThreadCliente("saque", 100.00);
        MinhaThreadCliente transferencia1 = new MinhaThreadCliente("transferencia", 100.00);

        MinhaThreadCliente saque2 = new MinhaThreadCliente("saque", 2000.00);
        MinhaThreadCliente transferencia2 = new MinhaThreadCliente("transferencia", 2000.00);

        MinhaThreadCliente saque3 = new MinhaThreadCliente("saque", 200.00);
        MinhaThreadCliente transferencia3 = new MinhaThreadCliente("transferencia", 200.00);
	}


}
