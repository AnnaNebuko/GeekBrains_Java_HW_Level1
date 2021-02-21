package ru.geekbrains.gb;

public abstract class Animal {
    private String name;
    public static int countAnimal; //static - метод принязался не к объект, а к классу. Уничтожает
    //динамику
    private int maxRunDistance;
    private int maxSwimDistance;

    public Animal(String name, int maxRunDistance, int maxSwimDistance){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        countAnimal++;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public String getName() {
        return name;
    }

    public abstract boolean run(int length);
    public abstract boolean swim(int length);

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", maxRunDistance=" + maxRunDistance +
                ", maxSwimDistance=" + maxSwimDistance +
                '}';
    }
}
