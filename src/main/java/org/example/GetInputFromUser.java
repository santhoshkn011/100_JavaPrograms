package org.example;
/*
How to get Using input using Scanner
 */
import java.util.Scanner;
public class GetInputFromUser {
    public static void main(String[] args) {
        String str;
        int a;
        float b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        str = sc.nextLine();
        System.out.println("You entered String: "+str);

        System.out.println("Enter Integer");
        a = sc.nextInt();
        System.out.println("You entered integer: "+a);

        System.out.println("Enter Float value");
        b=sc.nextFloat();
        System.out.println("You entered Float: "+b);
    }
}
