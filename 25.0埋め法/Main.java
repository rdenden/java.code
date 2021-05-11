
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        // 0埋め法　String.format(書式,値)
        // %・・・書式文字列であることを表す指示子
        // 0・・・埋める文字。この場合ゼロ
        // 3・・・桁数。この場合3桁
        // d・・・出力する値の型。この場合整数(decimal)
        System.out.println(String.format("%03d",line));
    }
}