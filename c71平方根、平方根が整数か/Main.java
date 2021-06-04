import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int count = 0;
        for (int i = 1;i < w;i++) {
            for (int j = 1;j < h;j++) {
              // Math.sqrtで平方根
              // 切り捨て前と切り捨て語を比べて整数か否か判定
                double a = Math.sqrt(i*i + j*j);
                double b = Math.floor(Math.sqrt(i*i + j*j));
                if (a == b) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}