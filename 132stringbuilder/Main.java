import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String line = sc.next();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < num;i++) {
          // 文字列を格納
            sb.append(line);
        }
        // 連結文字列を呼び出し
        String result = sb.toString();
            
        System.out.println(sb.toString());
    }
}