package exercicios_0x01;

import java.util.Scanner;

public class temperatraFemC {

    public static void main(String [] args) {

        try (Scanner scan = new Scanner(System.in)){

            System.out.println("Qual a temperatura em Graus Fahrenheit ?");

            double Fahrenheit = scan.nextDouble();
            double Celsius = (Fahrenheit - 32) * 5/ 9;

            System.out.println("O valor da temperatura em graus celcius e de" + Celsius);

        }
    }
}
