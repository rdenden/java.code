import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        // 先頭の文字をchar型でとる
        char head = line.charAt(0);
        // これをStringに変換
        String str = String.valueOf(head);
        // 新たにStringオブジェクトを作り、これに先頭の文字を文字列の長さ分代入
        String result = "";
       for (int i = 0; i < line.length();i++) {
           result += str;
       }
      //  最後にイコールか判定
       if (result.equals(line)) {
           System.out.println("NG");
       } else {
           System.out.println("OK");
       }
        
    }
}