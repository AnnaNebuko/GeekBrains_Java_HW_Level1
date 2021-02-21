package ru.geekbrains.gb;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Animal [] animals = { new Dog(500, 250),
                new Cat(200)
        };

        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
            System.out.println("Run: "+ animals[i].run((160)));
            System.out.println("Swim: "+ animals[i].swim((60)));
        }
        System.out.println("Total animals: " + Animal.getCountAnimal());
        System.out.println("Total animals: " + Cat.getCountAnimal());
        System.out.println("Total animals: " + Dog.getCountAnimal());

    }

}
