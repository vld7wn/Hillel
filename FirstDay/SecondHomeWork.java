package FirstDay;

public class SecondHomeWork {
    public static void main(String[] args){
        int[] number = new int[10];
        for(int i = 0; i < number.length;i++)
            number[i] = (int) (Math.random() * 10 + 10);
       float average = (float)Math.sqrt(number.length);
        System.out.println(average);
    }
}
