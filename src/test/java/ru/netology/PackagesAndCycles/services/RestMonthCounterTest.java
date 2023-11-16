package ru.netology.PackagesAndCycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestMonthCounterTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void testRMCt(int expected, int threshold, int income, int expenses) {

        RestMonthCounter service = new RestMonthCounter();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
