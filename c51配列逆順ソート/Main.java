import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer [] num = new Integer [4];
        for (int i = 0;i < 4;i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        int result = (num[2] + num[3])*10 + num[0] + num[1];
        System.out.println(result);
        // 配列降順ソートはCollections.reverseOrder()を用いる
        // このときラッパーIntegerを使う
        // Arrays.sort(num, Collections.reverseOrder());
        // System.out.println(Arrays.toString(num));
    }
}