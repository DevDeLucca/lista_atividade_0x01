package com.lucas;

import java.util.Scanner;

public class conversaoMetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite a metragem: ");
			
			double metros = scan.nextDouble();
			double cm = metros * 60;
			
			System.out.println("O resultado em cm foi de: " + cm);
						
		}
	}

}
