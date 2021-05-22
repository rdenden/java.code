import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 配列は0で初期化されている
        int [] fax = new int[24];
        int capa = sc.nextInt();
        int faxNum = sc.nextInt();
        for (int i = 0;i < faxNum;i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            fax[h] += sc.nextInt();
        }
        int sum = 0;
        for (int value: fax) {
            if (!(value % capa == 0)) {
                sum += value / capa + 1;
            } else { 
                sum += value / capa;
            }
        }
        System.out.println(sum);
    }
}