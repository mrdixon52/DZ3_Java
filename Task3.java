import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(20, 2, 3, 180, 5, 6, 7, 1, 100, 33, 11));
        int sum = 0;
        int min = arr.get(0);
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if (arr.get(i) < min ){
                min = arr.get(i);
            }
            if (arr.get(i) > max){
                max = arr.get(i);
            }
        }
        System.out.println(arr);
        int sredneeArifm = sum / arr.size();
        System.out.println("Среднее арифметическое = " + sredneeArifm);
        System.out.println("Максимальное число = " + max);
        System.out.println("Минимальное число = " + min);
    }
}
