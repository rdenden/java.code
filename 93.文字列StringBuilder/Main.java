import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int count = 0;
        for (int i = 0; i < 10;i++) {
          // StringBuilderを用いた連結
            StringBuilder sb = new StringBuilder();
            // iを文字列に変換
            String s = String.valueOf(i);
            for (int j = 0;j < line.length();j++) {
              // バッファにiを追加
                sb.append(i);
            }
            // 連結文字列を呼び出し
            String result = sb.toString();
            
            if (result.equals(line)) {
                System.out.println(result);
                break;
            }
            count += 1;
            
        }
        if (count == 10) {
            System.out.println("No");
        }
    }
}