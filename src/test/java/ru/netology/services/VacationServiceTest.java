package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void shouldCalculateCountMonthVacation(int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        // вызываем целевой метод:
        int countMonthVacation = service.calculate(income, expenses, threshold);
        System.out.println("Количество месяцев отдыха в год " + countMonthVacation);

    }
}
