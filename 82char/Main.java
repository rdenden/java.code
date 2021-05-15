import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        char ch2Start = line2.charAt(0);
        char ch2End = line2.charAt(line2.length()-1);
        char ch1 = line1.charAt(line1.length()-1);
        // charはオブジェクトではない基本型
        if ((ch1 == ch2Start) && !(ch2End == 'n')) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}