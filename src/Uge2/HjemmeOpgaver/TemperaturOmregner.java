package Uge2.HjemmeOpgaver;
public class TemperaturOmregner {
    public static void main(String[] args){
    double celsius = fahrToCels(115);
    System.out.println("from 115 fahrenheit to celsius " + celsius);

    double fahrenheit = celsToFahr(20);
    System.out.println("from 20 celcius to fahrenheit " + fahrenheit);
    }

    public static double fahrToCels(double fahr){
    double cels = (fahr - 32) * 5/9;
    return cels;
    }

    public static double celsToFahr(double cels){
    double fahr = (cels *9/5) + 32;
    return fahr;
    }

}
