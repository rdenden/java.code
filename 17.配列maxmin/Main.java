import java.util.*;
// Javaではmax,minメソッドなし

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            array[i] = num;
        }
        int max = array[0];
        int min = array[0];
        for (int value: array) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.println(max);
        System.out.println(min);

        // 配列の表示
        // System.out.println(Arrays.toString(array));
    }
}