package exercicios_0x02;

import java.util.Scanner;

public class maiorNumero {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero? ");
        double primeiro = scan.nextDouble();

        System.out.println("Digite o segundo numero? ");
        double segundo = scan.nextDouble();

        System.out.println("Digite o terceiro numero? ");
        double terceiro = scan.nextDouble();


        if (primeiro > segundo && primeiro > terceiro ) {
            System.out.println("O primeiro numero e o maior");
        }

        else if (segundo > terceiro && segundo > primeiro ){
            System.out.println("O segundo numero e o maior");
        }

        else if (terceiro > primeiro && terceiro > segundo){
            System.out.println("Terceiro numero e o maior");
        }

        else {
            System.out.println("Invalido");
        }

    }
}