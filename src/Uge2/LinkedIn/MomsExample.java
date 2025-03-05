package Uge2.LinkedIn;
public class MomsExample {
    public static double calculateTotalMealPrice(double listedPrice,
                                               double tipRate,
                                               double taxRate) {

        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        return result;
    }

    public static void main(String[] args){
        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
    // ".5" og ".18", for at fortælle, at vi ønsker den procentdel
        System.out.println("Totale pris for gruppen er: " + groupTotalMealPrice + "£");

        double individualTotalMealCost = groupTotalMealPrice / 5;
        System.out.println("\nI skal hver især betale: " + individualTotalMealCost + "£");
    }
}
