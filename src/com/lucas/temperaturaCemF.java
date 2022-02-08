package com.lucas;

import java.util.Scanner;

public class temperaturaCemF {

    public static void main(String [] args) {

        try (Scanner scan = new Scanner(System.in)){

            System.out.println("Qual a temperatura em Graus Celsius?");

            double Celsius = scan.nextDouble();
            double Fahrenheit =  (Celsius * 9) / 5 + 32;

            System.out.println("O valor da temperatura em graus Fahrenheit e de " + Fahrenheit);

        }
    }
}
