package pl.sdacademy.java7krk;

public class Kula {

    private double pi = Math.PI;
    private double r ;

    public Kula(double r) {
        this.r = r;
    }


    public double kula (){
        return 4/3*pi*r*r*r;

    }
}
