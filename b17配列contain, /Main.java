import java.util.*;


public class Main {
    public static void main(String[] args) {
      // Integerは宣言で自動で初期化しない
        Integer[] num = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean wild = false;
        String result = "";
        for(int i = 0;i < 4;i++) {
            char c = s.charAt(i);
            if (c == '*') {
                wild = true;
                continue;
            }
            String st = String.valueOf(c);
            // インデックス取得
            num[alphabet.indexOf(st)] += 1;
            
        }
        
        if (wild) {
          // Arrays.asList(num)は基本形であるint型不可。numはIntegerとする
            if  (Arrays.asList(num).contains(3)) {
                result = "FourCard";
            } else if (Arrays.asList(num).contains(2)) {
                result = "ThreeCard";
                
            } else if (Arrays.asList(num).contains(1)) {
                result = "OnePair";
            }
        } else {
            if  (Arrays.asList(num).contains(4)) {
                result = "FourCard";
            } else if (Arrays.asList(num).contains(3)){
                result = "ThreeCard";
            } else if (Arrays.asList(num).contains(2)) {
                if (Arrays.asList(num).contains(1)) {
                    result = "OnePair";
                } else {
                    result = "TwoPair";
                }
            } else {
                result = "NoPair";
            }
        }
        System.out.println(result);
    }
}