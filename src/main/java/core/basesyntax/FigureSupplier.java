package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = rand.nextInt(5);
        String color = colorSupplier.getRandomColor();

        return switch (type) {
            case 0 -> new Circle(color, rand.nextInt(10) + 1);
            case 1 -> new Square(color, rand.nextInt(10) + 1);
            case 2 -> new Rectangle(color,
                    rand.nextInt(10) + 1,
                    rand.nextInt(10) + 1);
            case 3 -> new RightTriangle(color,
                    rand.nextInt(10) + 1,
                    rand.nextInt(10) + 1);
            default -> new IsoscelesTrapezoid(color,
                    rand.nextInt(10) + 1,
                    rand.nextInt(10) + 1);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }
}
