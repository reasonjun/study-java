package chap7;

public class SamsungTv extends Tv {

    boolean caption;

    void display(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

}
