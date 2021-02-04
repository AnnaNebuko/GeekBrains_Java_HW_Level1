package ru.geekbrains.gb;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        prepareAndPlay();
        while (repeatOrEnd() == 1)
            prepareAndPlay();
        System.out.println("Thank you for playing");
    }
    static void prepareAndPlay(){
        int randomNumber = generateRandomNumber();
        //int userNumber = takeUserNumber();
        playGame(randomNumber);
    }
    static int generateRandomNumber(){
        Random random = new Random();
        int number = random.nextInt(10);
        return number;
    }
    static int takeUserNumber(){
        Scanner in = new Scanner(System.in);
        System.out.print("Guess the number : ");
        int input = in.nextInt();
        return input;
    }
    static int playGame(int randomN){
        int userNumber = takeUserNumber();
        for (int attempts = 1; attempts < 3; attempts++ ) {
            System.out.println(compareTwoNumbers(randomN, userNumber));
            if (compareTwoNumbers(randomN, userNumber) == "You are won!") return 0;
            userNumber = takeUserNumber();
        }
        System.out.println("You lose.");
        return 0;
    }
    static String compareTwoNumbers(int randomN, int userN){
        if (randomN == userN) return "You are won!";
        return (randomN > userN) ? "Your number is less than our" :
                "Your number is greater than our";
    }
    static int repeatOrEnd(){
        Scanner in = new Scanner(System.in);
        System.out.println("Repeat or end (1/0)?");
        int input = in.nextInt();
        return (input == 1) ? 1 : 0;
    }
}
