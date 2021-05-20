package FirstDay;

public class FirstHomeWork {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("Hello ");
                if (i % 5 == 0) {
                    System.out.print("World ");
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.print("HelloWorld");
                    }
                }
            } else {
                System.out.print(" " + i + " ");
            }
        }
    }
}
