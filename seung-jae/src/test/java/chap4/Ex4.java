package chap4;

public class Ex4 {

    public int solution4_3() {
        // 1 + 1+2 + 1 + 2 + 3
        int value = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            value += i;
            sum += value;
        }

        return sum;
    }

    public void solution4_4() {
        int index = 1;
        int swap = 1;
        int num = 0;
        int sum = 0;

        while(sum < 100) {
            num = index * swap;
            sum += num;
            swap = -swap;
            index++;
        }

        System.out.println(num);
        System.out.println(sum);
    }

}
