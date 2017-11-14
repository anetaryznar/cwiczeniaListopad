package pl.sdacademy.java7krk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        isDivisible(3,4);
//        boolean a = isTriangle(2,2,3);
//        System.out.println(a);
//        multadd();
        // oddSum();

//        Power.power(2,3);
//        rectangle();


//        Pi.pi();
//        System.out.printf("Pi "+ "%6.5f",Pi.pi());
//        System.out.println();
//        System.out.printf("pierwiatek kwadratowy  " +"%3.2f",Pi.pp());

//        kula();

//        Division.division();
//        System.out.println(Division.division());
//        System.out.println(Division.modulo());

//        count();

        triangle();


    }

    public static void triangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj a");
        int a = scanner.nextInt();
        System.out.println("podaj b");
        int b = scanner.nextInt();
        System.out.println("podaj c");
        int c = scanner.nextInt();

        Triangle triangle = new Triangle(a,b,c);
        System.out.println(triangle.trian());
    }


    public static void count() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj x");
        float x = scanner.nextFloat();
        System.out.println("podaj y");
        float y = scanner.nextFloat();

        Count count = new Count(x,y);
        System.out.println(x+y);
        System.out.printf("%3.2f\n" ,x/y);
        System.out.println(x*y);
        System.out.println(x-y);

    }

    public static void kula() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj r");
        double r = scanner.nextDouble();
        Kula kula = new Kula(r);
        System.out.println(kula.kula());

    }

    public static void rectangle() {
        Rectangle rectangle = new Rectangle();
        double ss = rectangle.rectangle();
        System.out.println(ss);
    }

    public static void oddSum() {
        OddSum oddSum = new OddSum();
        int sunma = oddSum.oddSum(3);
        System.out.println();


    }

    public static void multadd() {
        Multadd multadd = new Multadd();

        double wynik = multadd.multadd(2, 4, 3);
        System.out.println(wynik);
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a + b >= c || a + c >= b || b + c >= a) {
            return true;
        }
        return false;

    }

    public static boolean isDivisible(int n, int m) {
        if (n % m != 0) {
            return false;
        }
        return true;
    }

}
