import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Data型の配列
        Data [] medal = new Data[num];
        for (int i = 0;i < num;i++) {
            medal[i] = new Data(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        // コンパレータにてソート
        Arrays.sort(medal, new MedalComparator());
        for (Data value: medal) {
            System.out.println(value);
        }
        
    }
    // 配列に格納するオブジェクト
    public static class Data  {
        int a, b, c;
        public Data(int a, int b,int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        // toStringオーバーライド
        public String toString() {
            return this.a + " " + this.b + " " + this.c;
        }
    }
    // コンパレータ
    public static class MedalComparator implements Comparator<Data> {
      // 降順に並べる
        public int compare(Data x, Data y) {
            if (x.a == y.a) {
                if (x.b == y.b) {
                    return y.c - x.c;
                } else {
                    return y.b - x.b;
                }
            } else {
                return y.a - x.a;
            }
        }
    }
    
}
