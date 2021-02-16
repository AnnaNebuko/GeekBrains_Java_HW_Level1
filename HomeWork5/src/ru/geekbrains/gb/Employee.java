package ru.geekbrains.gb;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int yearOfBirth;

    public Employee(String fullName, String position, String email, String phoneNumber,
                    int salary, int yearOfBirth) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public String toString() {
        System.out.println("Full name: " + fullName + "; position: " + position + "; phoneNumber: " +
                        phoneNumber + "; salary: " + salary + "; yearOfBirth: " + yearOfBirth);
        return null;
    }
}
