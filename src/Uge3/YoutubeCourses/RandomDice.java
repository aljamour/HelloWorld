package Uge3.YoutubeCourses;
import java.util.Random;

public class RandomDice {
    public static void main(String[] args){

        Random random = new Random();
        int x = random.nextInt(6) + 1;

        System.out.println("You rolled a: " + x);
    }

}
