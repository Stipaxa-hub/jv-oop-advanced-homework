package core.basesyntax;

/**
 * Class with main methods.
 */
public class Application {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i <= figures.length / 2 - 1) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
