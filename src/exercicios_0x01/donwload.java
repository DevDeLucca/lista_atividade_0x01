package exercicios_0x01;

import java.util.Scanner;

public class donwload {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Coloque o tamnho do arquivo: ");
        double tamArquivo = scan.nextDouble();

        System.out.println("Coloque a velocidade da internet: ");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo /  velInternet;

        System.out.println("tempo de donwload é de " + tempo);
    }
}
