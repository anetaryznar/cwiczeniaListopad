package pl.sdacademy.java7krk;

public class Main {

    public static void main(String[] args) {

//        isDivisible(3,4);
//        boolean a = isTriangle(2,2,3);
//        System.out.println(a);
//        multadd();
        // oddSum();

//        Power.power(2,3);


          rectangle();



    }

    public static void rectangle(){
        Rectangle rectangle=new Rectangle();
        double ss=rectangle.rectangle();
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
