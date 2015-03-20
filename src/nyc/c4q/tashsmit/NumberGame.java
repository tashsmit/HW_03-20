package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/19/15.
 */
import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        int chances = 20;
        System.out.println("Guess the number. You have " + chances + " chances");

        for (; chances >= 0; chances --) {
            int guess = input.nextInt();
            if (guess < randomInt) {
                System.out.println("Your guess is too low. You have " + chances + " chances left.");
            }
            else if (guess > randomInt){
                System.out.println("Your guess is too high. You have " + chances + " chances left.");
            }
            else
                System.out.println("You guessed correctly!");

        }
        System.out.println("You ran out of chances. The number was " + randomInt);

    }


}

