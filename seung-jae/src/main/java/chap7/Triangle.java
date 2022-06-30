package chap7;

public class Triangle extends Shape {

    Point[] p = new Point[3];

    Triangle(Point[] p) {
        this.p = p;
    }

    @Override
    void draw() {
        System.out.println(p[0].getXY() + " " + p[1].getXY() + " " + p[2].getXY() + " " + color);
    }

}
