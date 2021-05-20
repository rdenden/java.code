import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] prices = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        // 昇順ソート
        Arrays.sort(prices);
        System.out.println(prices[1]);
    }
}