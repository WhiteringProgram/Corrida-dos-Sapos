package controller;

public class ThreadCorridaSapo extends Thread {
	
	private int numSapo;
	private int distanciaTotal = 300;
	private int pulo;
	private static int posicao;
	
	public ThreadCorridaSapo (int numSapo) {
		this.numSapo = numSapo;
	}
	
	public void run() {
		corridaSapo();
	}

	private void corridaSapo() {
		int distanciaCorrida = 0;
		while (distanciaCorrida < distanciaTotal) {
			pulo = (int)((Math.random() * 7));
			distanciaCorrida += pulo;
			System.out.println("O "+numSapo+"º sapo pulou " +pulo+ 
					" metros e já percorreu " +distanciaCorrida + " metros ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		posicao++;
		System.out.println("O "+numSapo+ "º sapo foi o "+posicao+"º colocado");
	}
}
