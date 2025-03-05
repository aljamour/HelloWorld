package Uge4.Hjemmeopg;
import java.util.Arrays;

public class ArraysHjemmeOpgave {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 5, 8, 4, 9}; // Opretter array med kendte værdier
        printReverse(numbers); // Kalder på metoden ved navn printReverse

        int[] arr = {11, 77, 33, 44, 55, 66, 77};
        int target = 77;

        int appearances = count(arr, target);
        System.out.println("Target " + target + " found " + appearances + " times.");

        String[] arr2 = {"Mazda", "Maserati", "Mercedes", "Maserati"};
        String target2 = "Maserati";
        String replacement = "McLaren";

        replaceAll(arr2, target2, replacement); // når der kaldes skal parametrene indenfor den angivne metode også kaldes, ellers ved java ikke hvad du vil.

        System.out.println(Arrays.toString(arr2)); // udskriver det opdaterede array

        String[] arr3 = {"nudler", "spaghetti", "fettucine", "fusilli", "gnocchi", "macaroni", "gnocchi"};
        String target3 = "gnocchi";

        int index = indexOf(arr3, target3);
        System.out.println(index);

        int[] arr4 = {-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38};

        int[] newUnevenArr = oddNumbers(arr4);
        System.out.println(Arrays.toString(newUnevenArr));

        int[] arr5 = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39};

        int[] newEvenArr = evenNumbers(arr5);
        System.out.println(Arrays.toString(newEvenArr));
    }

    public static void printReverse(int[] numbers) {
        int[] reversed = new int[numbers.length]; // Opretter nyt array med samme længde som det oppe i main metoden

        for (int i = 0; i < numbers.length; i++) { // loop gennem værdierne/elementerne i numbers-arrayet
            reversed[i] = numbers[numbers.length - 1 - i]; // kopierer baglæns = numbers.length "7" minus "1" minus "i" og sådan fortsætter den. Dvs. det sjette indeks først - 0, osv.
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reversed));
    }

    public static int count(int[] arr, int target) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) { // kan også lave et for-each loop: for (int j : arr) { if (j == target) { counter++; } } return counter;

            if (arr[i] == target) {
                counter++;
            }
        }
        return counter; // int "counter" returneres efter for-loopet er kørt igennem, dvs når den er færdig med at tælle
    }

    public static void replaceAll(String[] arr2, String target2, String replacement) {
        for (int i = 0; i < arr2.length; i++) { // gennemløber hvert element i arrayet
            if (arr2[i].equals(target2)) {  // hvis elementet matcher target
                arr2[i] = replacement; // - erstat elementet med replacement, som er sat til "McLaren"
            }
        }
    }

    public static int indexOf(String[] arr3, String target3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i].equals(target3)) { // hvis indeks rammer det angivne target - "gnocchi" - så returnerer den i,
                return i;                 // altså hvilket indeks det er på. Hvis flere forekomster, så kun den første
            }

        }
        return -1; // hvis den ikke rammer target så returnerer den -1
    }

    public static int[] oddNumbers(int[] arr4) {
        int count = 0;
        for (int element : arr4) { // hvert element gennemgås i array'et
            if (element % 2 != 0) { // hvis resten (modulus) af et tal divideret med 2 er 1, er tallet ulige. Hvis resten er 0, så er tallet lige.
            count++; // tæl op i array'et, dvs gennemgå resten af det
            }
        }

        int[] uligeTal = new int[count]; // opretter nyt array med de nye elementerne som count holder på
        int index = 0;

        for (int element : arr4){
            if (element % 2 != 0) {
                uligeTal[index] = element;
                index++;
            }
        }
        return uligeTal;
    }

    public static int[] evenNumbers(int[] arr5) {
        int count = 0;
        for (int element : arr5) { // gennemløber arrayet
            if (element % 2 == 0) { // hvis resten (modulus) af et tal divideret med 2 er 1, er tallet ulige. Hvis resten er 0, så er tallet lige.
                count++; // tæller op i array'et, dvs gennemgår resten af det
            }
        }

        int[] ligeTal = new int[count]; // opretter nyt array med de nye elementerne som count holder på, hvis det er 22, så har arrayet "ligeTal" også et array på 22.
        int index = 0;

        for (int element : arr5){ // hvert element i arr5 gennemgås
            if (element % 2 == 0) { // tjekker om tallet er lige: hvis resten (modulus) af elementet er 0, så er tallet lige
                ligeTal[index] = element; // hvis tallet er lige, så gemmer den tallet (element) på paldsen (index), her gemmes 4 på index 0, dvs. første plads i det nye array
                index++; // tæller op, så alle elementerne gennemgås og gemmes på pladserne [0, 1, 2, 3...] i rækkefølge
            }
        }
        return ligeTal; // returnerer array'et med lige tal
    }
}
