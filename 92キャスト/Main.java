import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();
        double per = num3 / (num1*num2);
        double num4 = sc.nextInt();
        double num5 = sc.nextInt();
        double num6 = sc.nextInt();
        double per1 = num6 / (num4*num5);
        if (per == per1) {
            System.out.println("DRAW");
        } else if (per < per1) {
          // doubleをintにキャストする
            System.out.println((int) num1 + " " + (int)num2 + " " + (int)num3);
        } else {
            System.out.println((int) num4 + " " + (int)num5 + " " + (int)num6);
        }
        
    }
}