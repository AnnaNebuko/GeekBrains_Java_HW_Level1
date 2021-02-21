package ru.geekbrains.gb;

import java.util.Scanner;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food, int appetite) {
        while (food < appetite) {
            System.out.printf("\n" +
                    "Attention! Food cannot be less than appetite%n" +
                    "Need to add %d food!%n", appetite - food);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to add food? (yes/no)\n");
            String answer = scanner.nextLine();
            if (answer.equals("yes")) food += addFood();
            else System. exit(0);
        }
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public int addFood(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input food size to add");
        int foodSize = scanner.nextInt();
        food += foodSize;
        return food;
    }
}
