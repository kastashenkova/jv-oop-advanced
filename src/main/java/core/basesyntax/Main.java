package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        Drawable[] figures = new Drawable[NUMBER_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < NUMBER_OF_FIGURES / 2; i++) {
            figures[i] = (Drawable) figureSupplier.getRandomFigure();
        }
        for (int i = NUMBER_OF_FIGURES / 2; i < NUMBER_OF_FIGURES; i++) {
            figures[i] = (Drawable) figureSupplier.getDefaultFigure();
        }
        for (Drawable figure : figures) {
            figure.draw();
        }
    }
}
