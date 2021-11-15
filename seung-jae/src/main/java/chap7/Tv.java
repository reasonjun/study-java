package chap7;

public class Tv {
    boolean power;
    int channel;

    void oppositePower() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
