import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        
        while (true) {
            int len = num.length();
            String num1 = "";
            for(int i = 0;i < len;i++) {
                num1 += num.substring(len-1-i,len-i);
            }
            if (num.equals(num1)) {
                System.out.println(num);
                break;
            } else {
                int numInt = Integer.valueOf(num);
                int numInt1 = Integer.valueOf(num1);
                num = String.valueOf(numInt + numInt1);
            }
        }
        
    }
}