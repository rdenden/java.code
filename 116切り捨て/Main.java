import java.util.*;


public class Main {
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        // 10の位を切り捨て
        // 100で割って切り捨てて100掛ける
        double result = Math.floor(num/100) * 100;
        int result1 = (int)result;
        System.out.println(result1);
    }
}