package ex;

public class Ex2 {

    private int a;
    private int b;

    public Ex2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        int temp = a;
        a = b;
        b = temp;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}
