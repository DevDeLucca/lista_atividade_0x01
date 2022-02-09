package exercicios_0x02;

import java.util.Scanner;

public class anoBissexto {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        int ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano %  4 == 0  && ano % 100 != 0)) {
            System.out.println("E um ano bissexto");
        }
        else {
            System.out.println("Não e um ano Bissexto");
        }
    }
}
