import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        // splitメソッドで分割
        String [] word = line.split(":");
        int num = Integer.parseInt(word[0]);
        if (num - 8 >= 0 ) {
            System.out.println(num - 8 + ":" + word[1]);
        } else {
            System.out.println(24 + (num - 8) + ":" + word[1]);
        }
    }
}