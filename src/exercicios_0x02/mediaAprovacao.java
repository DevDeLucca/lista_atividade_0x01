package exercicios_0x02;

import java.util.Scanner;

public class mediaAprovacao {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double primeiraNota = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double  segundaNota = scan.nextDouble();

        double mediaAluno = primeiraNota + segundaNota / 2;


        if (mediaAluno == 10) {
            System.out.println("Aprovado Com distinção");
        }

        else if (mediaAluno >= 7) {
            System.out.println("Aprovado");
        }

        else {
            System.out.println("Reprovado");
        }

    }
}
