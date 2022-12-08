package org.example;

import java.util.Scanner;

/*
The formula for Fahrenheit to Celsius is °C = [(°F-32)×5]/9.
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float f;
        float c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        f = sc.nextInt();
        c = ((f-32)*5)/9;
        System.out.println("In Celsius: "+c);
    }
}
