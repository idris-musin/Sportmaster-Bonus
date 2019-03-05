package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusCardTest {

    @Test
    void goldCard() {

        BonusCard service = new BonusCard();

        int bonus = service.calculate(150_123, 1_000);

        assertEquals(15_000, bonus);
    }

    @Test
    void silverCard() {
        BonusCard service = new BonusCard();

        int bonus = service.calculate(15_123, 1_000);

        assertEquals(1_050, bonus);
    }

    @Test
    void blueCard() {
        BonusCard service = new BonusCard();

        int bonus = service.calculate(5_123, 1_000);

        assertEquals(250, bonus);
    }

    @Test
    void noCard() {
        BonusCard service = new BonusCard();

        int bonus = service.calculate(523, 0);

        assertEquals(0, bonus);
    }
}
