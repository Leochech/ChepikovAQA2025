package old;

import org.junit.Test;

public class Main {

    HiByeHyperboleArr hBHArr = new HiByeHyperboleArr();
    Employee developer = new Developer("Дмитрий", 100);
    Employee manager = new Manager("Артём", 50);
    Shape s1 = new Rectangle();
    Shape s2 = new Circle();
   Guitar guitar = new Guitar();
   Piano piano = new Piano();


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

    @Test
    public void tasksModuleFive() {
        hBHArr.outputFirstStringInArray().outputSecondStringInArray().fiendWordWhereSecondO();
    }

    @Test
    public void tasksModuleSeven() {
        developer.work();
        manager.work();

        s1.draw();
        s2.draw();
    }

    @Test
    public void tasksModuleEight() {
        var guitarStruna = StrungsCount.GUITAR;
        var pianoStruna = StrungsCount.PIANO;

        guitar.play(guitarStruna.getStruna());
        piano.play(pianoStruna.getStruna());
    }

    @Test
    public void tasksModuleNine() {
        hBHArr.generateRandomNumber();
        hBHArr.getRandomString();
    }
}
