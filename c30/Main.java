import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        for (int i = 0;i < h;i++) {
            int num;
            for (int j = 0;j < w;j++) {
                num = sc.nextInt();
                if (num >= 128) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
                if (!(j == w-1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("\n");
                }
            }
        }
    }
}