package view;

import controller.ThreadCorridaSapo;

public class Principal {
	
	public static void main(String[] args) {
		
		for (int numSapo = 1; numSapo < 6 ; numSapo++) {
			Thread s = new ThreadCorridaSapo(numSapo);
			s.start();
		}
	}
}
