import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String line = sc.next();
        // 0~num-1まで切り出す
        String result = line.substring(0,num);
        System.out.println(result);
    }
}