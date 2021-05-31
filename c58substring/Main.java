import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = sc.next();
        String start = sc.next();
        int count = 0;
        for (int i = 0;i < start.length();i++) {
            if (result.equals(start)) {
                break;
            }
            String part1 = start.substring(0,1);
            String part2 = start.substring(1,start.length());
            start = part2 + part1;
            count += 1;
            
        }
        System.out.println(count);
    }
}