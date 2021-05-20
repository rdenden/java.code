import java.util.*;


public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        for (int i = 0;i < 10;i++) {
            String s = String.valueOf(i);
            String str = line.replace(s,"");
            if (str.length() < 3) {
                System.out.println("NG");
                break;
            }
            if (i == 9) {
                System.out.println("OK");
            }
        }
    }
}