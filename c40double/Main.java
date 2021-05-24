import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double hMax = 200.0;
        double hMin = 0.0;
        for (int i = 0;i < num;i++) {
            String le_ge = sc.next();
            double height = sc.nextDouble();
            if (le_ge.equals("le") && hMax > height) {
                hMax = height;
            } else if (le_ge.equals("ge") && hMin < height) {
                hMin = height;
            }
        }
        System.out.println(hMin + " " + hMax);
    }
}