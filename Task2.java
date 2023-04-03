import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 18, 5, 6, 7, 10, 100, 33, 11));
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0){
                arr.remove(i);
                i--; 
            }
        }
        System.out.println(arr);
    }
}
