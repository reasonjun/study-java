package chap3;

public class Ex3 {

    private final int score;

    public Ex3(int score) {
        this.score = score;
    }

    public char solution() {
        if (score >= 90) {
            return 'A';
        }

        if (score >= 80) {
            return 'B';
        }

        if (score >= 70) {
            return 'C';
        }

        return 'D';
    }
}
