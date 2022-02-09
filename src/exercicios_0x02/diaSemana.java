package exercicios_0x02;

import java.util.Scanner;

public class diaSemana {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o dia da semana de (1 - 7): ");
        int diaSem = scan.nextInt();

        switch (diaSem) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sabado"); break;
            default: System.out.println("Não e um dia da semana valido"); break;


        }
    }

}
