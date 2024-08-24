package app;

public class Triangle implements Figures {

    private final double height;
    private final double length;

    public Triangle (double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {
        return 0.5*length*height;
    }
}
