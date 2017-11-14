package pl.sdacademy.java7krk;

public class Triangle {

    private int a;
    private int b;
    private int c;


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String  trian (){
        if (a>0 && b>0 && c>0){
            return "ok" ;
        }
        return "no";
    }
}
