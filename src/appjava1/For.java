package appjava1;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        int i = 0;

        for (; i < 10; i++) {
            System.out.println(i);
        }
    }
}