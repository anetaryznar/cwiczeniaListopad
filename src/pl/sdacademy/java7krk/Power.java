package pl.sdacademy.java7krk;

public class Power {


    public static double power (double x, int n){
        System.out.println("n="+n);
        if (n== 0){
            return 1;
        }

       double ret = power(x,n-1);
        System.out.println("ret=" +ret+ " n="+n);
        double dd= ret*x;
        System.out.println("dd="+dd);
        return dd;




    }


}
