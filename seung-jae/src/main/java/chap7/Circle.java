package chap7;

public class Circle extends Shape {
    Point center;
    int r;

    public Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    public Circle() {
        this(new Point(0, 0), 100);
    }

    @Override
    void draw() {
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }

}
