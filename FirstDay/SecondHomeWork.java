package FirstDay;

import java.util.Random;

public class SecondHomeWork {
    public static void main(String[] args) {
        Random r = new Random();
        int[] number = new int[10];
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
//            number[i] = (int) (Math.random() * 11 + 10);
            number[i] = r.nextInt(11) + 10;
            sum += number[i];
//            System.out.println(number[i]);
        }

        int average = sum / number.length;

//        System.out.println(sum + " Не в цикле");
        System.out.println(average);
    }
}
