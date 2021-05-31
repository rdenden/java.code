import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        boolean none = true;
        for (int i = 0;i < num;i++) {
            String str1 = sc.next();
            if (str1.contains(str)) {
                System.out.println(str1);
                none = false;
            }
        }
        if (none) {
            System.out.println("None");
        }
    }
}