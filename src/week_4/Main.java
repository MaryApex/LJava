package week_4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Random randomNumber = new Random();
        Scanner userNumber;
        userNumber = new Scanner(System.in);
        int secretNumber;
        int userAnswer;
        final int MAX = 100;
        boolean correct = true;

        secretNumber = randomNumber.nextInt(MAX) + 1;

        while (correct) {

            System.out.println("Gues the number from 1 to 100");
            userAnswer = userNumber.nextInt();

            if (secretNumber == userAnswer) {
                correct = false;
                System.out.println("Your answer is correct. You won $1000000!");
            } else if (userAnswer < secretNumber ) {
                System.out.println("Nope! My number is bigger. Try again");
            } else if (userAnswer > secretNumber ) {
                System.out.println("Nope! My number is lower. Try again");
            }
        }
    }
}
