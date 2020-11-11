package Coursera;

public class SimpleCalc {
    public static void calc1() {
        int x;
        x = 4 + 3 * 2;
        int y = x - 6;
        x = x * y;
        System.out.println(x);
    }
    public static void calc2() {
        int x = 2;
        int y = x * 3;
        int z = y / 2;
        x = (2 + z) % 2;
        System.out.println(x);
    }

    public static void main(String[] args) {
        calc1();
        calc2();
    }
}