import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String [][] data = new String[num][num];
        for (int i = 0;i < (num*num-num)/2;i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            data[num1-1][num2-1] = "W";
            data[num2-1][num1-1] = "L";
        }
        for (int i = 0;i < num;i++) {
            data[i][i] = "-";
        }
        for (int i = 0;i < num;i++) {
            for (int j = 0;j < num;j++) {
                if (j != num-1) { 
                    System.out.print((data[i][j]));
                } else {
                    System.out.println((data[i][j]));
                }
                if (j != num-1 ) {
                    System.out.print(" ");
                }
            }
        }
    }
}