package ex;

import org.junit.jupiter.api.Test;

public class VarEx1 {

    @Test
    void test(){
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age +2000; //변수 age의 값에 2000을 더하여 year에 저장
        age = age + 1; // 변수 age에 저장된 값을 1 증가

        System.out.println(year); // year를 화면에 출력
        System.out.println(age); //age를 화면에 출력
    }
}
