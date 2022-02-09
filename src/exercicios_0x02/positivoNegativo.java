package exercicios_0x02;

import java.util.Scanner;

public class positivoNegativo {

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor");
        double primeiroValor = scan.nextDouble();


        if (primeiroValor > 0) {
            System.out.print("Esse numero e positivo");
        }

        else {
            System.out.println("Esse valor e negativo");
        }

    }
}
