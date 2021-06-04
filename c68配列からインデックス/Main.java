import java.util.*;




public class Main {
    public static void main(String[] args) {
        // アルファベット配列を作る
        char []alphabet = new char[26];
        char al = 'A';
        for (int i = 0; i < 26; i++){
            alphabet[i] = al++;
        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = sc.next();
        // 文字列を一文字ずつのchar[]配列とする
        char[] c = s.toCharArray(); 
        StringBuilder sb = new StringBuilder();
        int[] alNum = new int[s.length()];
        // アルファベット配列のインデックスを取得しalNum配列に格納
        for(int i = 0;i < s.length();i++) {
            for(int j = 0;j < 26;j++) {
                if (c[i] == alphabet[j]) {
                    alNum[i] = j;
                }
            }
        }
        // 条件に合わせてスライド
        for(int i = 0;i < s.length();i ++) {
            if (i % 2 == 0) {
                if (alNum[i] - num >= 0) {
                    System.out.print(alphabet[alNum[i] - num]);
                } else {
                    System.out.print(alphabet[alNum[i] - num + 26]);
                }
            } else {
                if (alNum[i] + num <= 25) {
                    System.out.print(alphabet[alNum[i] + num]);
                } else {
                    System.out.print(alphabet[alNum[i] + num - 26]);
                }
            }
        }
    }
}