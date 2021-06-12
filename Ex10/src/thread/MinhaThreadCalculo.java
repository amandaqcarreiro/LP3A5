package thread;

import java.util.Scanner;

public class MinhaThreadCalculo implements Runnable {
	
	private String nome;
	private static Calculadora calc = new Calculadora();
	
	
	public MinhaThreadCalculo(String nome) {
		this.nome = nome;
		new Thread(this, nome).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int op, resultado;
		
		System.out.println(this.nome + " iniciada");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escolha uma opcao:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtracao");
		System.out.println("3 - Multiplicacao");
		System.out.println("4 - Divisao");
		
		op = ler.nextInt();
		
		switch (op) {
			case 1:
				resultado = calc.soma();
				System.out.println("Resultado: " +resultado);
			break;
				
			case 2:
				resultado = calc.subtracao();
				System.out.println("Resultado: " +resultado);
			break;
			
			case 3:
				resultado = calc.multiplicacao();
				System.out.println("Resultado: " +resultado);
			break;
			
			case 4:
				resultado = calc.divisao();
				System.out.println("Resultado: " +resultado);
			break;
			
			default:
				System.out.println("Digite uma opcao valida!");
				
			break;
		}
	}

}
