import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = "";
        for (int i = 0;i < num;i++) {
            String st = sc.next();
            char c = st.charAt(0);
            // char → String変換  　String str = String.valueOf(c)
            // String → char変換    char[] c = str.toCharArray();
            String st1 = String.valueOf(c);
            result += c;
        }
        
        System.out.println(result);
    }
}