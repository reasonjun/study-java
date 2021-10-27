package ex;

import org.junit.jupiter.api.Test;

public class StringEx {

    @Test
    void TestString(){
        String name = "Ja" + "va";
        String str = name + 8.0;
        System.out.println(name); //Java
        System.out.println(str); //Java*.0
        System.out.println(7 + " "); //7
        System.out.println(" " + 7);// 7
        System.out.println("" + 7);//7
        System.out.println("" + "");//
        System.out.println(7 + 7 + "");//14
        System.out.println("" + 7 + 7);//77
    }
}
