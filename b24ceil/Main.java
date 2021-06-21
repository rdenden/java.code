import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        int rr = (int)Math.ceil(r);
        int count = 0;
        for(double i = 0;i < rr;i++) {
            for(double j = 0;j < rr;j++) {
                if (i*i + j*j < r*r) {
                    count += 1;
                }
            }
        }
        System.out.println(count*4);
    }
}