package com.koznem;

public class SquareRoot {

    private double x1;
    private double x2;

    public String go(double a, double b, double c){

        double discriminant = calculateDisciminant(a,b,c);

        if(discriminant < 0){
            return "No real roots";
        } else if(discriminant == 0){
            return "1 root : " + ((-b)/2*a);
        }else {
            x1 = (-b + Math.sqrt(discriminant))/(2*a);
            x2 = (-b - Math.sqrt(discriminant))/(2*a);
            return "2 roots : x1 = " + x1 + "; x2 = " + x2;
        }


    }

    private double calculateDisciminant(double a, double b, double c){ return ((b*b) - (4*a*c));}




}
