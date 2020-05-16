package com.company;

public class GuessNumber {

    private int winningNumber;
    private int guessingNumber;
    private int countGuess = 10;

    public int getWinningNumber() {
        return winningNumber;
    }

    public void setWinningNumber(int winningNumber) {
        this.winningNumber = winningNumber;
    }

    public int getGuessingNumber() {
        return guessingNumber;
    }

    public void setGuessingNumber(int guessingNumber) {
        this.guessingNumber = guessingNumber;
    }

    public static boolean checkNumber(){

        return true;
    }
    public static void startGame(){
        System.out.println("Welcome to the Number Guessing Game !");
        System.out.println("You will have 10 chances to guess the winning number");
        System.out.println("The number you can guess are from 1 - 100 (Include 1 and 100)");
    }
}
