import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int point = 0;
        for (int i = 0;i < num;i++){
            String correct = sc.next();
            String ans = sc.next();
            
            if (correct.length() == ans.length()) {
                int count = 0;
                for (int j = 0;j < correct.length();j++) {
                    if (!(correct.charAt(j) == ans.charAt(j))) {
                        count += 1;
                    }
                }
                if (count == 0) {
                    point += 2;
                } else if (count == 1) {
                    point += 1;
                } 
            } 
        }
        System.out.println(point);
    }
}