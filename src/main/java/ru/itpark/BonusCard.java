package ru.itpark;

public class BonusCard {
    public int calculate(int currentPurchase, int totalPurchases) {

        int standardLevel = 50;
        int silverLevel = 70;
        int goldLevel = 100;

        int goldCardBonus = 150_000;
        int silverCardBonus = 15_000;

        int commonPurchase = currentPurchase + totalPurchases;

        int bonusSum = currentPurchase / 1_000;

        if (commonPurchase > goldCardBonus) {
            return bonusSum * goldLevel;
        }

        if (commonPurchase > silverCardBonus) {
            return bonusSum * silverLevel;
        }

        int result = bonusSum * standardLevel;

        return result;
    }
}
