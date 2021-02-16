package ru.geekbrains.gb;


public class Main {

    public static void main(String[] args) {
        Employee []employees = {new Employee("Arkady White", "Администратор", "Arkady.White.com",
                        "8-920-700-70-70", 35000, 1990),
                new Employee ("Ibrahim Gray", "Бухгалтер", "Ibrahim.Gray.com",
                        "8-920-700-80-80", 50000, 1980),
                new Employee ("Vlada Black", "Курьер", "Vlada.Black.com",
                        "8-920-700-90-90", 25000, 1995)};
        findOlderThan(40, employees);
    }

    private static void findOlderThan(int age, Employee []employees) {
        for (Employee employee: employees) {
            if (employee.getYearOfBirth() <= 1980) employee.toString();
        }
    }
}

