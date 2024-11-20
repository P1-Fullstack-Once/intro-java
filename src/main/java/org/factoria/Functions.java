package org.factoria;

public class Functions {
    public static void main(String[] args) {
        int number = 5;
        int number2 = 3;

        /*suma(number1, number2);
        suma(7, 8);*/
        int result = suma(4,5);
        System.out.println(result);

        esMayorDeEdad(8);
    }

    /**
     * Function: suma
     * @param number1 (int)
     * @param number2 (int)
     * @return (int)
     * Esta funcion devuelve al suma de dos numeros
     */
    public static int suma(int number1, int number2) {
        return number1 + number2;
    }

    public static void esMayorDeEdad(int age) {
        if (age > 0 && age < 10 ){
            System.out.println("You can drink milk!");
        } else if (age >= 10 && age < 18) {
            System.out.println("You can drink lemon soda!");
        } else if (age >= 18 && age <= 120){
            System.out.println("You can drink wine!");
        } else {
            System.out.println("You need to provide a number between 0 and 120");
        }
    }
}
