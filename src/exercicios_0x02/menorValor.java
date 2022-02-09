package exercicios_0x02;

import java.util.Scanner;

public class menorValor {

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        double val1 = scan.nextDouble();

        System.out.println("Informe o segundo valor:");
        double val2 = scan.nextDouble();

        System.out.println("Informe o terceiro valor: ");
        double val3 = scan.nextDouble();

        if (val1 < val2 && val1 < val3) {
            System.out.println("O primeiro valor" + val1 + "e o menor, compra aprovada.");
            }
            else if  (val2 < val1 && val2 < val3) {
            System.out.println("O segundo valor" + val2 + "e o meno, compra aprovada.");
            }
            else if (val3 < val1 && val3 < val2) {
                System.out.println("O terceiro valor e o menor.");
            }
            else {
                System.out.println("Valor invalido.");
                }

    }
}
