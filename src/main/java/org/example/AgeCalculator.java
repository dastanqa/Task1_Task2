package org.example;

import java.time.LocalDate;

public class AgeCalculator {
    public static boolean isUser18OrOlder(String dateOfBirth) {
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        LocalDate currentDate = LocalDate.now();
        LocalDate eighteenYearsAgo = currentDate.minusYears(18);

        return birthDate.isBefore(eighteenYearsAgo) || birthDate.isEqual(eighteenYearsAgo);
    }
}
