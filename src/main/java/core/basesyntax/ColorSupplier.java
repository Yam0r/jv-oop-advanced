package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.name();
    }

    public enum Color {
        GREEN,
        YELLOW,
        BLUE,
        PINK,
        BLACK,
        WHITE,
        PURPLE
    }

}
