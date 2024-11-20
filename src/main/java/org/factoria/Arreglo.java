package org.factoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arreglo {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        String[] cities = {"Barcelona", "Valencia", "Sevilla", "Lisboa"};
        double[] prices = {20.5, 45.5, 65.7};



       /* String showarray = Arrays.toString(prices);
        System.out.println(showarray);*/

        //Loops
       /* for (double price : prices) {
            System.out.println(price);
        }
        */

        //Listas
        List<String> ciudades = new ArrayList<>();
        ciudades.add("Tokyo");
        ciudades.add("Bogotá");
        ciudades.add("New York");
        ciudades.add("Natal");

        ciudades.remove(0);

        System.out.println(ciudades);


        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }
}
