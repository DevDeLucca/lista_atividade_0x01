package exercicios_0x02;

import java.util.Scanner;

public class reajusteSalarial {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salario: ");
        double salFunc = scan.nextDouble();

        int percetual = 0;
        if (salFunc < 280){
            percetual = 20;
        }
        else if (salFunc > 280 && salFunc < 700) {
            percetual = 15;
        }
        else if (salFunc >= 700 && salFunc < 1500) {
            percetual = 10;
        }
        else if (salFunc >= 1500) {
            percetual = 5;
        }

        double aumento = (salFunc / 100) * percetual;
        double salFuncAjust =  salFunc + aumento;

        System.out.println("Salario: " + salFunc);
        System.out.println("Percentual: " + percetual);
        System.out.println("Aumento: " + aumento);
        System.out.println("salario ajustado: " + salFuncAjust);
    }
}
