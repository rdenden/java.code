import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        // char型で受け取る
        char line = sc.next().charAt(0);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alpha.length(); i++)
        // alpha.charAt(i)は文字列i番目取得
            if (alpha.charAt(i) == line) {
                System.out.println(i+1);
                break;
            }
            
    }
}