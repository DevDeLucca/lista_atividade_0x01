package exercicios_0x02;

import java.util.Scanner;

public class descFolPag {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da hora: ");
        double valhor = scan.nextDouble();

        System.out.println("Digite as horas trabalhadas em um mes: ");
        double qtdHoras = scan.nextDouble();

        double salBru = valhor * qtdHoras;

        int percentIr = 0;
        if(salBru <= 900){
            percentIr = 0;
        }
        else if(salBru> 900 && salBru <= 1500) {
            percentIr = 5;
        }
        else if(salBru > 1500 && salBru <= 2500) {
            percentIr = 10;
        }
        else if(salBru > 2500) {
            percentIr = 20;
        }

        double ir = (salBru / 100) * percentIr;
        double inss = (salBru / 100) * 10;
        double fgts = (salBru / 100) * 11;
        double totDesc = ir + inss ;
        double salLiq = salBru - totDesc;

        System.out.println("Salário Bruto: (" + valhor + " * " + qtdHoras + " ): " + salBru);
        System.out.println("(-) IR (" + percentIr +" %): + " + ir);
        System.out.println("(-) INSS (10%):" + inss);
        System.out.println("(-) FGTS (11%):" + fgts);
        System.out.println("Total de descontos: " + totDesc);
        System.out.println("Salario Liquido: " + salLiq);
    }
}
