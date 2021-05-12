import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String [] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        for (int i = 0;i < num1;i++) {
            System.out.print(alpha[i]);
        }
        System.out.print("\n");
        for (int i = num1;i < num1 + num2;i++) {
            System.out.print(alpha[i]);
        }
        System.out.print("\n");
        for (int i = num1 + num2;i < num1 + num2 + num3;i++) {
            System.out.print(alpha[i]);
        }
        
    }
}