package com.lucas;

import java.util.Scanner;

public class mediaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite a primeira nota: ");
			System.out.println("Digite a Segunda nota: ");
			System.out.println("Digite a Terceira nota: ");
			System.out.println("Digite a Quarta nota: ");
			
			double primeiraNota = scan.nextInt();
			double segundaNota = scan.nextInt();
			double terceiraNota = scan.nextInt();
			double quartaNota = scan.nextInt();
			double media = primeiraNota + segundaNota + terceiraNota + quartaNota / 4;
			
			
			System.out.println("A media do aluno foi: " + media);
			
		}
				

	}

}
