package app;

public class Square implements Figures {

    private final double length;

    public Square (double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}