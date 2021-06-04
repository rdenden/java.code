import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0;i < num;i++) {
            String result = "";
            Integer[] count = {0,0,0,0,0,0,0,0,0,0};
            String str = sc.next();
            for (int j = 0;j < 4;j ++) {
                for (int k = 0;k < 10;k++) {                    
                    if (str.charAt(j) == String.valueOf(k).charAt(0)) {
                        count[k] += 1;
                        
                    }
                }
                
            }
            // Arrays.asList(配列).contains(検索対象)で検索対象を含むか判定
            // この場合Listを用いるので配列にはオブジェクトを格納しなければならない
            // intではなくIntegerにする
            if (Arrays.asList(count).contains(4)) {
                result = "Four Card";
            } else if (Arrays.asList(count).contains(3)) {
                result = "Three Card";
            } else if (Arrays.asList(count).contains(2) && Arrays.asList(count).contains(1)){
                result = "One Pair";
            } else if (Arrays.asList(count).contains(2)) {
                result = "Two Pair";
            } else {
                result = "No Pair";
            }
            System.out.println(result);
        }
        
    }
}