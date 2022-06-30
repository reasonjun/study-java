package chap6;

public class Block {
    static {
        System.out.println("static으로 클래스 초기화 블럭");
    }

    {
        System.out.println("인스턴스 초기화");
    }

    public static void main(String[] args) {
        System.out.println("클래스 초기화");
        Block block = new Block();
    }
}
