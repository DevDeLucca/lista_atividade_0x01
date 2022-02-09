package exercicios_0x01;

import java.util.Scanner;

public class entradaDados {
	
	public static void main(String [ ] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite um numero:");
			
			int numero = scan.nextInt();
			
			System.out.println("Seu nome � : " + numero );
			
		}
	
	}

}

/*public static void main(String [] args) {
try (Scanner scan = new Scanner(System.in)) {
    System.out.println("Digite seu primeiro nome, segundo nome, idade, possue filhos:");
    String primeiroNome = scan.next();
    String segundoNome = scan.next();
    int idade = scan.nextInt();
    boolean possueFilhos = scan.nextBoolean();
    
    System.out.println("Seu primeiro nome �: " + primeiroNome);
    System.out.println("Seu segundo nome  �: " + segundoNome);
    System.out.println("Seua idade �: " + idade);
    System.out.println("Filhos: " + possueFilhos);*/