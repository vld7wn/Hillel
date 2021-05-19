package FirstDay;

public class ThreeHomeWork {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++){
            System.out.print("(" + returnNumberToString(i) + ")");
        }
    }
    public static String returnNumberToString(int a) {
        return String.valueOf(a);
    }
}
