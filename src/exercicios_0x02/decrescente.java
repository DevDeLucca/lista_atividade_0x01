package exercicios_0x02;

import java.util.Scanner;

public class decrescente {

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = scan.nextDouble();

        System.out.println("Digite o primeiro numero: ");
        double num2 = scan.nextDouble();

        System.out.println("Digite o primeiro numero: ");
        double num3 = scan.nextDouble();
        if (num1 < num2 && num1 < num3) {
            System.out.println("O primeiro valor" + num1 + "e o menor, compra aprovada.");
        }
        else if  (num2 < num1 && num2 < num3) {
            System.out.println("O segundo valor" + num2 + "e o meno, compra aprovada.");
        }
        else if (num3 < num1 && num3 < num2) {
            System.out.println("O terceiro valor e o menor.");
        }
        else {
            System.out.println("Valor invalido.");
        }

        // mesma estrutura de repetição porem com mais condicional de if else das atividades anteriores

    }
}
