package exercicios_0x01;

import java.util.Scanner;

public class imc {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a altura: ");
        double altura = scan.nextDouble();

        double pesoIdeial = (72.7 * altura) - 58;

        System.out.println("Seu peso ideial e de: " + pesoIdeial);

        }
    }

