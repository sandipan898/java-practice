package Coursera;

public class ConditionalExample {
    public static int f (int x, int y) {
        if(x < y) {
            System.out.println("X < y");
            return y + x;
        }
        else {
            System.out.println("X >= y");
            if(x > 8) {
                return y + 7;
            }
        }

        return x - 2;
    }
    
    public static int g() {
        int a = f(3, 4); 
        int b = f(a, 5);
        return b;
    }

    public static void main (String[] args) {
        System.out.println(g());
    }
}
