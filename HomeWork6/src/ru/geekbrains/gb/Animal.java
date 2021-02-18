package ru.geekbrains.gb;

public class Animal {
    String name;
    public static int countAnimal;

    public Animal(String name){
        this.name = name;
        countAnimal++;
    }

    void run(int length) {}
    void swim(int length) {}
}
