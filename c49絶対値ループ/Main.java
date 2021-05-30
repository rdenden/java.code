import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int beforeFloor = 1;
        int sum = 0;
        for (int i = 0;i < num;i++) {
            int nowFloor = sc.nextInt();
            sum += Math.abs(nowFloor - beforeFloor);
            beforeFloor = nowFloor;
        }
        System.out.println(sum);
    }
}