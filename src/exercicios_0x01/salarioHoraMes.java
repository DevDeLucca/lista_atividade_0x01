package exercicios_0x01;

import java.util.Scanner;

public class salarioHoraMes {

    public static void main (String [] args){

        try (Scanner scan = new Scanner (System.in)) {
            System.out.println("Digite quanto você recebe por hora: ");
            System.out.println("Quantas horas trabalhadas por dia: ");

            double recebeH = scan.nextInt();
            double recebeM = scan.nextInt();
            double totalMes = recebeH * recebeM * 31 ;

            System.out.println("o salario mensal foi de " + totalMes );
        }
    }
}
