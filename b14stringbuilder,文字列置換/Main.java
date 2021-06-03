import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        // StringBuilder格納用配列
        StringBuilder[] result = new StringBuilder[z];
        for(int i = 0;i < z;i++) {
          // StringBuilderで....の文字列を作る
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j < y;j++) {
                sb.append(".");
            }
            for(int j = 0;j < x;j++) {
                String line = sc.next();
                
                for(int k = 0;k < y;k++) {
                  // インデックスkが＃の時、StringBuilderのインデックスk番目を＃に置き換える
                    if (line.charAt(k) == '#') {
                        sb.setCharAt(k, '#');
                    }
                }
            }
            result[i] = sb;
            // 無意味な入力値
            String bar = sc.next();
        }
        for(int i = 0;i < z;i++) {
            System.out.println(result[z-1-i]);
        }
        
    }
}