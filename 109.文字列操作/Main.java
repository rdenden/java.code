import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line1 = line.replace(" ","");
        String result = "";
        for (int i = 0;i < line1.length();i++) {
            char ch = line1.charAt(0);
            result += String.valueOf(ch);
        }
        if (result.equals(line1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}