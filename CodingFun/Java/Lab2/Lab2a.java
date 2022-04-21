
import java.util.Scanner;
/*
 * Lab2a.java
 *
 * Authors: Samantha Smith, Martin Lillo
 */
// TODO: Import Scanner
public class Lab2a {
    public static void main(String[] args) {
        double Fahrenheit = 373.2;
        double Kelvin = kelvins(Fahrenheit);
        System.out.println(Kelvin);
        
        temperaturePrinter(Fahrenheit, Kelvin);
    }
    
    public static double kelvins(double F) {
        double kelvins;
        kelvins = (5.0/9.0) * (F - 32) + 273.15;
        System.out.println(kelvins);
        return kelvins;
    }
    
    public static void temperaturePrinter(double F,double K) {
        System.out.println(F);
    }
    
    public static void main2(String[] args) {
        inSeconds(0,2,0); // 120
        secondTime(9001); // 2:30:1
        inSeconds(24,0,0); // 86400
        secondTime(3600); // 1:0:0
        inSeconds(-1,61,-60); // 0
    }
    
    public static void secondTime(int seconds) {
        int hours = seconds / 3600;
        seconds = seconds % 3600;
        
        int minutes = seconds / 60;
        seconds = seconds % 60;
        
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
    
    public static void inSeconds(int hh, int mm, int ss) {
        int seconds = 0;
        seconds = seconds + (hh * 3600);
        seconds = seconds + (mm * 60);
        seconds = seconds + (ss);
        
        System.out.println(seconds);
    }
    
}
