package Figure;

public class Rhombuses extends Quadrangle implements Figure {
    double alpha, beta;

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return b * getHeight();
    }

    @Override
    public double perimeter() {
        return a * 4;
    }

    @Override
    public double getLargeDiagonal() {
        double c = a * Math.sqrt(2 - 2 * Math.cos(Math.toRadians(alpha)));
        double d = a * Math.sqrt(2 - 2 * Math.cos(Math.toRadians(beta)));
        return Math.max(c, d);
    }

    @Override
    public double getHeight() {
        return a * Math.sin(Math.toRadians(alpha));
    }

    @Override
    public String getColor() {
        return color;
    }
}
