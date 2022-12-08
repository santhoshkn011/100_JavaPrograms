package org.example;
//Passing arguments: Hi! I am Santhosh
/*
In Intellij
-> Go to Run, then edit configurations
-> You can pass arguments over there.
 */
public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("Your Command Line arguments are:"); // loop through all arguments and print it to the user
        for (String str: args) {
            System.out.println(str);
        }
    }
}
