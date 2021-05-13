import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 0;i < 7;i++) {
            double num = sc.nextInt();
            sum += num;
        }
        // 小数第一位まで出力　10倍して小数点の位置をずらす
        // 2つ目のdoubleはキャスト演算子
        double result = ((double)Math.round(sum / 7 * 10))/10;
        System.out.println(result);
    }
}