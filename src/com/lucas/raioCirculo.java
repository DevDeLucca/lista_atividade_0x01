package com.lucas;

import java.util.Scanner;

public class raioCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o raio do circulo: ");
			
			double raio = scan.nextDouble();
			double valorCircunferencia = raio * 2 * 3.1416;
			
			System.out.println("O valor da circunferencia e de " + valorCircunferencia);
		}
	}

}
