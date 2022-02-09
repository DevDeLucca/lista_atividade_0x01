package exercicios_0x02;

import java.util.Scanner;

public class maiorDigito {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero? ");
        double primeiro = scan.nextDouble();

        System.out.println("Digite o segundo numero? ");
        double segundo = scan.nextDouble();


        if (primeiro > segundo ) {
            System.out.println("O primeiro numero e o maior");
        }

        else {
            System.out.println("O segundo numero e o maior");
        }

    }
}