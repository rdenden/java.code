import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        if (line2.contains(line1)) {
            System.out.println("NG");
        } else {
            System.out.println(line2);
        }
    }
}