package exercicios_0x02;

import java.util.Scanner;

public class vogalConsoante {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra do alfabeto: ");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") ||
                letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){

                        System.out.println("Volgal");
        }

        else {
            System.out.println("Consoante");
        }

    }
}
