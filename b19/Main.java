import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();
        int [][] data = new int[num][num];
        for(int i = 0;i < num;i++) {
            for (int j = 0;j < num;j++) {
                data[i][j] = sc.nextInt();
            }
        }
        int times = num / base;
        
        for(int g = 0;g < times;g++) {
            for(int h = 0;h < times;h++) {
                int count = 0;
                for(int i = 0;i < base;i++) {
                    for(int j = 0;j < base;j++) {
                        count += data[i+g*base][j+h*base];
                    }
                }
                int avg = count/(base*base);
                if (h == times-1) {
                    System.out.println(avg);
                } else {
                    System.out.print(avg + " ");
                }
            }
        }
    }
}