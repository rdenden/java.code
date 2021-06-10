import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        String[] array = {"a", "e", "i", "o", "u" ,"A", "E", "I", "O", "U"};
        for (int i = 0;i < line.length();i++) {
          // 配列ではArrays.asList(array)でcontainsを使う
            if(Arrays.asList(array).contains(line.substring(i,i+1))) {
            } else {
                System.out.print(line.substring(i,i+1));
            }
        }
        
        
    }
}