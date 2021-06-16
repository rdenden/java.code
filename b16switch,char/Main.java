import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int num = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0;i < num;i++) {
            char c = sc.next().charAt(0);
            int move = sc.nextInt();
            switch(c) {
                case 'U':
                    y += move;
                    break;
                case 'D':
                    y -= move;
                    break;
                case 'R':
                    x += move;
                    break;
                case 'L':
                    x -= move;
                    break;
            }
        }
        x = x % w;
        if (x < 0) {
            x += w;
        }
        y = y % h;
        if (y < 0) {
            y += h;
        }
        System.out.println(x + " " + y);
    }
}