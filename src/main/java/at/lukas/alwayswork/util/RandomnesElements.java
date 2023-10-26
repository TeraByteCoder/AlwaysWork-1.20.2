package at.lukas.alwayswork.util;

import java.util.Random;

public class RandomnesElements {
    public static boolean generateRandomBoolean(double probability)
    {
        if (probability < 0.0 || probability > 1.0) {
            throw new IllegalArgumentException("Die Wahrscheinlichkeit muss zwischen 0.0 und 1.0 liegen.");
        }

        Random random = new Random();
        double randomValue = random.nextDouble(); // Generiere eine Zufallszahl zwischen 0 (inklusive) und 1 (exklusive).

        return randomValue < probability;
    }
    public static int generateInt(int min, int max)
    {
        int randomValue = min + (int)(Math.random() * (max - min));
        return randomValue;
    }

    public static int generateWithInverseProbability(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max muss größer sein als min.");
        }

        double lambda = 1.0 / (max - min + 1); // Lambda für die Exponentialfunktion
        Random random = new Random();
        double u = random.nextDouble(); // Gleichmäßig verteilte Zufallszahl zwischen 0 und 1

        // Verwende die Exponentialfunktion, um eine Zahl im Bereich von min bis max zu generieren
        int generatedValue = (int)(-Math.log(1 - u) / lambda) + min;

        return generatedValue;
    }
}

