import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0;i < num;i++) {
          // char型で受け取る方法
            char dis = sc.next().charAt(0);
            int e  = sc.nextInt();
            int m  = sc.nextInt();
            int si  = sc.nextInt();
            int j  = sc.nextInt();
            int so  = sc.nextInt();
            if (dis == 's') {
                if (si + m >= 160 && e + m + si + j + so >= 350 ) {
                    count += 1;
                }
            } else {
                if (j + so >= 160 && e + m + si + j + so >= 350 ) {
                    count += 1;
                }
            } 
            
        }
        System.out.println(count);
    }
}