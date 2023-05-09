package ru.netology.services;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха

                System.out.print(money + " Буду отдыхать. Потратил " + expenses + " Еще потратил ");
                System.out.println((money - (money - expenses) / 3) - expenses);

                money = (money - expenses) / 3;
            } else {
                System.out.println(money + " Буду работать. Заработал " + income + " Потратил " + expenses);
                money = money + income - expenses;
            }
        }
        return count;
    }
}
