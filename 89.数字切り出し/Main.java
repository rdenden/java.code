import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // [^0-9]は数字以外。[]内の＾は以外。数字以外を""に置換
        String result = str.replaceAll("[^0-9]", "");        
        System.out.println(result);
    }
}