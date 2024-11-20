package org.factoria;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //Condicionales

        //less than 10 years old: "You can drink milk!"
        //more than 10 years old and less than 18 years old: "You can drink lemon soda!"
        //more than 18: "You can drink wine!"
        //default: "You need to provide a number between 0 and 120"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu edad:");
        byte age = scanner.nextByte();



        if (age > 0 && age < 10 ){
            System.out.println("You can drink milk!");
        } else if (age >= 10 && age < 18) {
            System.out.println("You can drink lemon soda!");
        } else if (age >= 18 && age <= 120){
            System.out.println("You can drink wine!");
        } else {
            System.out.println("You need to provide a number between 0 and 120");
        }

        scanner.close();

        // "Outstanding": "Amazing! You’ve exceeded expectations, keep pushing forward!"
        //"Excellent": "Great job, keep doing well!"
        // "Good": "Good job, keep practicing!"
        // "Average": "Nice effort, but there's room for improvement."
        // "Poor": "Don't be discouraged, keep working hard, and you'll improve!"
        // "Very Poor": "Consider reviewing the basics, you can do it with practice!"

        /*String grade = "Excellent";

        switch (grade) {
            case "Outstanding":
                System.out.println("Amazing! You’ve exceeded expectations, keep pushing forward!");
                break;
            case "Excellent":
                System.out.println("Great job, keep doing well!");
                break;
            case "Good":
                System.out.println("Good job, keep practicing!");
                break;
            case "Average":
                System.out.println("Nice effort, but there's room for improvement.");
                break;
            case "Poor":
                System.out.println("Don't be discouraged, keep working hard, and you'll improve!");
                break;
            case "Very Poor":
                System.out.println("Consider reviewing the basics, you can do it with practice!");
                break;
            default:
                System.out.println("Grade not valid");
                break;
        }*/

    }
}
