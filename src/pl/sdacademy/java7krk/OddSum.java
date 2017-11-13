package pl.sdacademy.java7krk;

public class OddSum {

     public static int oddSum (int liczba){

         if(liczba<=0){
             return 0;
         }

         int suma = oddSum(liczba-1);

         if (liczba % 2 > 0){
             suma +=liczba;
         }
         return suma;


     }
}
