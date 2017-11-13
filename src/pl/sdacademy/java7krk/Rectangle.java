package pl.sdacademy.java7krk;

import java.util.Scanner;

public class Rectangle {


    public static double rectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj bok a");
        double a = scanner.nextDouble();

        System.out.println("podaj bok b");
        double b = scanner.nextDouble();

        double rec = a*b;

        return rec;

    }
}
