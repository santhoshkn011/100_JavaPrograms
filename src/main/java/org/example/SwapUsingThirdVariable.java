package org.example;

public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println("Before Swapping: ");
        System.out.println("a: "+a+", b: "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping: ");
        System.out.println("a: "+a+", b: "+b);
    }
}
