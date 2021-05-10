import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        int num = sc.nextInt();
        // substring(開始位置, 終了位置＋１)で切り取り
        String line2 = line1.substring(0, num);
        System.out.println(line2);
        String str1 = "abcdefghijk";
        String str2 = str1.substring(3, 6);
        System.out.println(str2); // def
    }
}