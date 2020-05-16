package com.company;

import java.util.Scanner;

public class GuessNumber {

    private int winningNumber  = (int)(Math.random()*(100 - 1)) + 1;
    private int guessingNumber;
    private int countGuess = 10;

    public int getWinningNumber() {
        return winningNumber;
    }

    public void setGuessingNumber(int guessingNumber) {
        this.guessingNumber = guessingNumber;
    }

    public int getCountGuess() {
        return countGuess;
    }

    public boolean checkNumber(){
        if(this.winningNumber == this.guessingNumber){
            return true;
        }
        else {
            countGuess--;
            return false;
        }
    }
    public boolean checkCount(){
        if(countGuess <= 1){
            return false;
        }else{
            return true;
        }
    }
    public void startGame(){
        System.out.println("----Welcome to the Number Guessing Game !----");
        System.out.println("----You will have 10 chances to guess the winning number----");
        System.out.println("----The number you can guess are from 1 - 100 (Include 1 and 100)----");
    }
}
