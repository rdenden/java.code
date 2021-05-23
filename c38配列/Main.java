import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int machine = sc.nextInt();
        int item = sc.nextInt();
        int minRemainder = 1000;
        int [] machines = new int[machine];
        for (int i = 0;i < machine;i++) {
            int container = sc.nextInt();
            machines[i] = container;
            int remainder = item % container;
            if (remainder < minRemainder) {
                minRemainder = remainder;
            }
        }
        int containerNum = 0;
        int result = 0;
        int i = 0;
        for (int value: machines) {
            i++;
            if (item % value == minRemainder) {
                if (value >= containerNum) {
                    containerNum = value;
                    result = i;
                }
            }            
        }
        System.out.println(result);
    }
}