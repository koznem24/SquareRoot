package com.koznem;

import java.util.Scanner;

public class App 
{
    static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args ) {

        SquareRoot squareRoot = new SquareRoot();

        double a,b,c;
        System.out.println("a = ");
        a = scanner.nextDouble();

        System.out.println("b = ");
        b = scanner.nextDouble();;

        System.out.println("c = ");
        c = scanner.nextDouble();

        System.out.println(new SquareRoot().go(a,b,c));
    }
}
