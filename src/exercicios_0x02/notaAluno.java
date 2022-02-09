package exercicios_0x02;

import java.util.Scanner;

public class notaAluno {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite a primeira nota: ");
            double primeiraNota = scan.nextInt();

            System.out.println("Digite a Segunda nota: ");
            double segundaNota = scan.nextInt();

            double media = (primeiraNota + segundaNota) / 2;

            String aprov = "";
            if (media >= 9 && media <= 10) {
                aprov = "A";
            } else if (media >= 7.5 && media < 9) {
                aprov = "B";
            } else if (media >= 6 && media < 7.5) {
                aprov = "C";
            } else if (media >= 4 && media < 6) {
                aprov = "D";
            } else if (media >= 0 && media < 4) {
                aprov = "E";
            }

            System.out.println("Nota 1: " + primeiraNota);
            System.out.println("Nota 1: " + segundaNota);
            System.out.println("Media " + media);
            System.out.println("Conceito " + aprov);


            switch (aprov) {
                case "A":
                case "B":
                case "C": System.out.println("Aprovado"); break;
                case "D":
                case "E":System.out.println("Reprovado"); break;

            }

        }

    }
}
