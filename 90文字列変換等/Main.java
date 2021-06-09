import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5;i++) {
            sum += sc.nextInt();
        }
        // 文字列→数値 int i = Integer.parseInt(s);
        // 数値→文字列 String s = String.valueOf(i);
        String s = String.valueOf(sum);
        char result = s.charAt(s.length()-1);
        System.out.println(result);
    }
}