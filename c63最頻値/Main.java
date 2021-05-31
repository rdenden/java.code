import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSeed = sc.nextInt();
        int [] data = new int[numSeed];
        for (int i = 0;i < numSeed;i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            data[i] = num1 + num2;
        }
        // 小さい順にソート
        Arrays.sort(data);
        // 最頻値　data[0]で初期化
        int modeNum = data[0];
        // 出現回数をチェックしている対象のナンバー　data[0]で初期化
        int checkNum = data[0];
        // 出現回数のカウンター
        int count = 1;
        // 最頻値の出現回数
        int maxCount = 1;
        for(int i = 1;i < numSeed;i++) {
            if (data[i] == checkNum) {
                count += 1;
            } else {
              // 最頻値の出現回数よりカウンターが上回った場合
                if (count > maxCount) {
                    modeNum = checkNum;
                    maxCount = count;
                }
                // カウンターリセット
                count = 1;
                // チェックナンバーの変更
                checkNum = data[i];
                
            }
        }
        // 最終ナンバーの処理
        if (count > maxCount) {
            modeNum = checkNum;
            maxCount = count;
        }
        // 最頻値複数の場合小さい方が出力される
        System.out.println(modeNum);
    }
}