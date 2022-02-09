package exercicios_0x02;

import java.util.Scanner;

public class genero {

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o genero M, F");
        String input = scan.nextLine();

        if (input.equalsIgnoreCase("F")) {
            System.out.print("F - Feminino");
        } else if (input.equalsIgnoreCase("M")) {
            System.out.println("M - MAsculino");
        } else {
            System.out.println("Sexo Invalido");

        }
    }
}
