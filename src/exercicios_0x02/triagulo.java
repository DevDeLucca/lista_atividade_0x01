package exercicios_0x02;

import java.util.Scanner;

public class triagulo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe a medida do Primeiro lado: ");

            double primlado = scan.nextInt();
            System.out.println("Informe a medida do Segundo lado: ");
            double segLado = scan.nextInt();

            System.out.println("Informe a medida do Terceiro lado: ");
            double terLado = scan.nextInt();


            if ((((primlado + segLado) > terLado) ||
                    ((segLado + terLado) > segLado) ||
                    ((segLado + terLado) > primlado))) {

                if (primlado == segLado && primlado == terLado && segLado == terLado) {
                    System.out.println("Triangulo Equilatero");
                } else if (primlado == segLado && primlado == terLado && segLado == terLado) {
                    System.out.println("Triangulo Escaleno");
                } else if (primlado == segLado || primlado == terLado || segLado == terLado) {
                    System.out.println("Triangulo Isóceles");
                }

                else {
                        System.out.println("Não e um triangulo");
                    }

                }

            }


        }
    }

