import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        char line = sc.next().charAt(0);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alpha.length(); i++)
            if (alpha.charAt(i) == line) {
                System.out.println(i+1);
                break;
            }
            
    }
}