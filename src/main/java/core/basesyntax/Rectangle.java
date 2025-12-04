package core.basesyntax;

public class Rectangle extends Figure implements Behavior {
    private int height;
    private int sideBelowHeight;

    public Rectangle(String color, int height, int sideBelowHeight) {
        super(color);
        this.height = height;
        this.sideBelowHeight = sideBelowHeight;
    }

    public int getSideBelowHeight() {
        return sideBelowHeight;
    }

    public void setSideBelowHeight(int sideBelowHeight) {
        this.sideBelowHeight = sideBelowHeight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return (double) (height * sideBelowHeight) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + area() + " sq. units, height: " + height
                + ", side below height: " + sideBelowHeight
                + " units, color: " + getColor());
    }
}
