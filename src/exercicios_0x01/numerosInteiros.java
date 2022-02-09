package exercicios_0x01;

import java.util.Scanner;

public class numerosInteiros {

    public static void main(String [] args){

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Digite o primeiro inteiro:");
            int num1 = scan.nextInt();

            System.out.println("Digite o segundo inteiro:");
            int num2 = scan.nextInt();

            System.out.println("Digite um numero real:");
            double num3 = scan.nextDouble();

            int resultado1 = (num1 * num2) * (num2 / num2);
            double resultado2 = (num1 * 3) + num3;
            double resultado3 = Math.pow (num3,3);

            System.out.println("Resultado1: " + resultado1);
            System.out.println("resultado2 : " + resultado2);
            System.out.println("resultado3: " + resultado3);


        }
    }
}
