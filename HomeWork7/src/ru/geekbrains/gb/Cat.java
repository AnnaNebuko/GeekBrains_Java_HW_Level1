package ru.geekbrains.gb;

public class Cat {
    private String name;
    private int appetite;
    boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate p) {
        if (appetite <= p.getFood()) {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.printf("%s is full %n", name);
            System.out.printf("Satiety is %s %n", satiety);
        }
        else System.out.println("Cat did not eat. \n" +
                "It is still hungry");
    }

}
