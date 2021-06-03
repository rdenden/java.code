import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dataNum = sc.nextInt();
        int number = sc.nextInt();
        // 二進法変換
        String number1 = Integer.toBinaryString(number);
        for (int i = 0;i < dataNum;i ++) {
            System.out.println(number1.charAt(number1.length()-sc.nextInt()));
        }
        
    }
}