package org.example;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println("Before Swapping: ");
        System.out.println("a: "+a+", b: "+b);
        System.out.println("After Swapping: ");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: "+a+", b: "+b);
    }
}
