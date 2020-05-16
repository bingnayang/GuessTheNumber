package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	    GuessNumber guessNumber = new GuessNumber();
	    guessNumber.startGame();
	    // For Testing
	    int num = guessNumber.getWinningNumber();
        System.out.println(num);

        // Declare the variable for number user enter.
        int number;
        System.out.println("Enter your first guess number: ");
        number = scanner.nextInt();

        while (true){
            guessNumber.setGuessingNumber(number);

            if(guessNumber.checkCount()){
                if(guessNumber.checkNumber()){
                    System.out.println("You got it !!");
                    System.out.println("The winning number is "+guessNumber.getWinningNumber());
                    break;
                }
                System.out.println("Nope, Keep Guessing. Still have "+guessNumber.getCountGuess()+" chances.");
                System.out.println("Enter the number again: ");
                number = scanner.nextInt();
            }else{
                System.out.println("Too many guessing. Game End");
                break;
            }
        }
    }
}
