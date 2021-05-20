import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        // 文字列追加
        sb.append(line);
        // 文字削除
        sb.delete(num-1, num);
        System.out.println(sb.toString());  

    }
}