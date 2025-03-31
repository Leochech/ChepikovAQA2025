package src.main;

import java.util.Scanner;

public class BankProcess {

    Scanner scanner = new Scanner(System.in);

    public float balanceInput() {
        float balance;
        while (true) {
            System.out.print("Введите сумму депозита: ");
            if (scanner.hasNextFloat()) {
                balance = scanner.nextFloat();
                if (balance > 0) {
                    return balance;
                } else {
                    System.out.println("Сумма должена быть положительной!");
                }
            } else {
                System.out.println("Попробуйте ещё раз!");
                scanner.next();
            }
        }
    }
    public int monthInput() {
        int monthСounter;
        while (true) {
            System.out.print("Введите кол-во мсяцев: ");
            if (scanner.hasNextInt()) {
                monthСounter = scanner.nextInt();
                if (monthСounter > 0) {
                    return monthСounter;
                } else {
                    System.out.println("Кол-во месяцев должно быть положительным!");
                }
            } else if (scanner.hasNextFloat()) {
                System.out.println("Кол-во месяцев должно быть целым!");
                scanner.next();
            }
        }
    }
    public void bankCalculation(String cycleForOrWhile) {

        float balance = balanceInput();
        int month = monthInput();
        float finalBalance = balance;

        if (cycleForOrWhile.equals("cycleFor")) {
            for (int i = 0; i < month; i++) {
                finalBalance = balance + (balance * 0.07f);
            }
        }else {
            while (month >0){
                finalBalance = balance + (balance * 0.07f);
                month--;
            }
        }
        System.out.printf("Итоговая сумма на депозите после %d месяцев: %.2f ₽", month, finalBalance);
    }
}
