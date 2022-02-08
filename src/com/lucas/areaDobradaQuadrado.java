package com.lucas;

import java.util.Scanner;

public class areaDobradaQuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Area do quadrado:");
			
			double areaQuadrado = scan.nextDouble();
			double valorDobrado = areaQuadrado * 4;
			
			
			System.out.println("O valor dobrado da area : " + valorDobrado);
		}

	}

}
