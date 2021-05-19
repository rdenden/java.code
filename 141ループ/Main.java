import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0;i < num;i++) {
            String line = sc.next();
            if (i ==  num - 1) {
                System.out.print(line);
            } else {
                System.out.print(line + " ");
            }
        }
        
    }
}