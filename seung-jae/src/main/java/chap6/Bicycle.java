package chap6;

public class Bicycle {

    String brandName;
    int speed = 0; //멈춰있으면 속도는 0이다.
    int gear = 1;  //기어는 기본 1이 들어가있기에 1로 설정

    public void setBrandName(String name) {
        brandName = name;
    }

    void upSpeed(int newValue) {
        speed = newValue;
    }

    void changeGear(int number) {
        gear = number;
    }

    void brake(int value) {
        speed -= value;
    }

}
