package exercicios_0x01;

import java.util.Scanner;

public class salarioComDescontos {

    public static void main (String [] args){

       Scanner scan = new Scanner(System.in);

       System.out.println("Digite o valor por Hora: ");
       double valorHora = scan.nextDouble();

        System.out.println("Quantidade de horas trabalhadas no mês : ");
        double horasMes = scan.nextDouble();

        double salarioBruto = valorHora * horasMes;

        double inss = (salarioBruto / 100) * 8;

        double sindicato = (salarioBruto / 100) * 5;

        double irrf = (salarioBruto / 100) * 11;

        double totalDescontos = inss + sindicato + irrf;

        double salarioLiquido = totalDescontos - salarioBruto;

        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Inss: " + inss);
        System.out.println("sindicato: " + sindicato);
        System.out.println("Irrf: " + irrf);
        System.out.println("salarioLiquido: " + salarioLiquido);

    }
}
