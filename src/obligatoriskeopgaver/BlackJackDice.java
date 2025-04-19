package obligatoriskeopgaver;
import java.util.Scanner;
import java.util.Random;

public class BlackJackDice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\uD83C\uDFB2Velkommen til Black Jack Dice!\uD83C\uDFB2");
        System.out.println("Du og jeg spiller mod hinanden");
        System.out.println("Indtast 's' for at starte");

        String userInput = scanner.nextLine(); //input fra brugeren
        
        if (!userInput.equals("s")) { // alle andre input end "s" vil ikek lade spillet starte og programmet stopper
            System.out.println("Spillet startede ikke");
            return;
        }


        // Brugeren spiller
        int userScore = random.nextInt(6) + 1 + random.nextInt(6) + 1; // to terninger
        System.out.println("Du slog: " + userScore);


        while (true) { // while-loopet er true, så loopet vil altid køre. Hvis det er falsk, kører det aldri.
            if (userScore == 21) {
                System.out.println("Tillykke, du fik Black Jack. Du vinder!");
                return; // programmet stopper
            }

            System.out.println("Vil du slå igen? Svar ja/nej");
            String userInput2 = scanner.nextLine();

            if (userInput2.equals("ja")) {
                int userRoll = random.nextInt(6) + 1 + random.nextInt(6) + 1; // to terninger
                userScore += userRoll;
                System.out.println("Du slog: " + userRoll + "\nDu er på: " + userScore);

                if (userScore > 21) {
                    System.out.println("Du fik over 21! Du taber");
                    return;
                }
            } else if (userInput2.equals("nej")) {
                System.out.println("Du endte med: " + userScore);
                break; // programmet stopper
            } else {
                System.out.println("Ugyldigt input, prøv igen");
            }
        }

        // Maskinens tur
        int computerScore = random.nextInt(6) + 1 + random.nextInt(6) + 1; // to terninger
        System.out.println("Jeg slog: " + computerScore);

        while (computerScore < 17) { //loopet gentages altid mens computerens score er 16 og under. Får computeren 17, stopper den.
            int computerRoll = random.nextInt(6) + 1 + random.nextInt(6) + 1;
            computerScore += computerRoll;
            System.out.println("Jeg slog: " + computerRoll + "\nJeg er på: " + computerScore);
        }

        if (computerScore == 21) {
            System.out.println("Jeg fik Black Jack. Jeg vinder!");
            return;
        }

        if (computerScore > 21 || userScore > computerScore) {
            System.out.println("Tillykke, du vandt!");
        } else if (computerScore == userScore) {
            System.out.println("Vi begge fik " + userScore + ". Jeg vinder!");
        } else {
            System.out.println("\nJeg vinder! Bedre held næste gang");
        }
    }
}