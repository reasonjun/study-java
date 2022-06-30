package chap7;

public class Point {

    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public String getXY() {
        return "(" + x + ", " + y + ")";
    }

}
