package obligatoriskeopgaver;
import java.util.Scanner;
import java.util.Random;

public class BlackJackDice2 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("\uD83C\uDFB2Velkommen til Black Jack Dice!\uD83C\uDFB2");
        System.out.println("Du og jeg spiller mod hinanden");
        System.out.println("Indtast 's' for at starte");

        if (!scanner.nextLine().equals("s")) {
            System.out.println("Spillet startede ikke");
            return;
        }

        int userScore = playerTurn();
        if (userScore > 21) return;
        int computerScore = computerTurn();
        determineWinner(userScore, computerScore);
    }

    public static int rollDice() {
        return random.nextInt(6) + 1 + random.nextInt(6) + 1;
    }

    public static int playerTurn() {
        int userScore = rollDice();
        System.out.println("Du slog: " + userScore);

        while (true) {
            if (userScore == 21) {
                System.out.println("Tillykke, du fik Black Jack. Du vinder!");
                return 21;
            }

            System.out.println("Vil du slå igen? Svar ja/nej");
            String response = scanner.nextLine();

            if (response.equals("ja")) {
                int newRoll = rollDice();
                userScore += newRoll;
                System.out.println("Du slog: " + newRoll + "\nDu er på: " + userScore);

                if (userScore > 21) {
                    System.out.println("Du fik over 21! Du taber");
                    return userScore;
                }
            } else if (response.equals("nej")) {
                System.out.println("Du endte med: " + userScore);
                break;
            } else {
                System.out.println("Ugyldigt input, prøv igen");
            }
        }
        return userScore;
    }

    public static int computerTurn() {
        int computerScore = rollDice();
        System.out.println("Jeg slog: " + computerScore);

        while (computerScore < 17) {
            int newRoll = rollDice();
            computerScore += newRoll;
            System.out.println("Jeg slog: " + newRoll + "\nJeg er på: " + computerScore);
        }

        if (computerScore == 21) {
            System.out.println("Jeg fik Black Jack. Jeg vinder!");
        }
        return computerScore;
    }

    public static void determineWinner(int userScore, int computerScore) {
        if (computerScore > 21 || userScore > computerScore) {
            System.out.println("Tillykke, du vandt!");
        } else if (computerScore == userScore) {
            System.out.println("Vi begge får: " + userScore + " - Jeg vinder!");
        } else {
            System.out.println("\nJeg vinder! Bedre held næste gang");
        }
    }
}