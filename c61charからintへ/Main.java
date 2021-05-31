import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String str1 = String.format("%03d",num1);
        String str2 = String.format("%03d",num2);
        String result = "";
        boolean zero = true;
        for(int i = 0;i < 3;i++) {
          // charをintに変換　'0'を引く
            int n1 = str1.charAt(i) - '0';
            int n2 = str2.charAt(i) - '0';
            if (n1 == 0 && n2 == 0 && zero == true) {
              // continueで以下飛ばして次のループへ
                continue;
            } else {
                zero = false;
            }
            String s = String.valueOf((n1 + n2) % 10);
            result += s;
        }
        System.out.println(result);
    }
}