import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = line.length();
        if (num > 10) {
            System.out.println(line.substring(0,10));
            System.out.println(line.substring(10,num));
        } else {
            System.out.println(line);
        }
        
        
    }
}