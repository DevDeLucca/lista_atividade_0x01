package com.lucas;

import java.util.Scanner;

public class somaDigitos {
	
		public static void main(String [] args) {
			
			try (Scanner scan = new Scanner(System.in)) {
				
				System.out.println("Digite o primeiro e o segundo digito: ");
				
				int numero1 = scan.nextInt();
				int numero2 = scan.nextInt();
				
				int resultado = numero1 + numero2;
				
				System.out.println("A soma dos digitos e igual a " + resultado);
					
		
		}

}
}
