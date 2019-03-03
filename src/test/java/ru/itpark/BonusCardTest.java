package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusCardTest {

    @Test
    void calculate() {
        {
            BonusCard service = new BonusCard();

            int bonus = service.calculate(150_000, 1_000);

            assertEquals(15_000, bonus);
        }

        {
            BonusCard service = new BonusCard();

            int bonus = service.calculate(15_000, 1_000);

            assertEquals(1_050, bonus);
        }

        {
            BonusCard service = new BonusCard();

            int bonus = service.calculate(5_000, 1_000);

            assertEquals(250, bonus);
        }

        {
            BonusCard service = new BonusCard();

            int bonus = service.calculate(500, 0);

            assertEquals(0, bonus);
        }
    }
}