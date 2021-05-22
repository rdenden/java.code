import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] [] stocks = new int[num] [4];
        for (int i = 0;i < num;i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();
            int [] stock = {num1,num2,num3,num4};
            stocks[i] = stock;
        }
        int result1 = stocks[0][0];
        
        int result2 = stocks[num-1][1];
        
        int max = 0;
        for (int i = 0;i < num;i++) {
            if (stocks[i][2] > max) {
                max = stocks[i][2];
            } 
        }
        int result3 =  max;
        
        int min = max;
        for (int i = 0;i < num;i++) {
            if (stocks[i][3] < min) {
                min = stocks[i][3];
            } 
        }
        int result4 = min;
        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
        
    }
}