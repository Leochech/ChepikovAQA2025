package src.main;

import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        Variables variables = new Variables("Я переменная 1", "Я переменная 2");
        System.out.println(Variables.var3 + "! " + variables.var1 + "! " + variables.var2 + "! ");
    }

    @Test
    public void tasksModuleFour() {
        Car car1 = new Car("Toyota Rav4", 2022, "Бип-Бип!\n");
        Car car2 = new Car("Volkswagen Polo", 2021, "Вов-вов!\n");
        Car car3 = new Car("BMW X45", 2025, "Не включаю поворотник!");
        car1.makeBebe();
        car2.makeBebe();
        car3.makeBebe();
    }
}
