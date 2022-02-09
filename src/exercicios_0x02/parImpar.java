package exercicios_0x02;

import java.util.Scanner;

public class parImpar {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int num = scan.nextInt();

        if(num % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }
    }
}
