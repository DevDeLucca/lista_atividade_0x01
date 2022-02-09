package exercicios_0x01;

import java.util.ArrayList;

public class testeArray {
    
    public static void main(String [] args) {


        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.remove(1);
        numeros.add(1, 3);
        numeros.set(1, 4);
        numeros.add(5);
        System.out.println(numeros);


        //ArrayList<String> name; name = new ArrayList<String>();

        //ArrayList name; name = new ArrayList<String>();

        //ArrayList<String> name; name = ArrayList<String>();

        //String<ArrayList> name; name = new String<ArrayList>();
    }
}
