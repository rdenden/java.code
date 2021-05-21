import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paraNum = sc.nextInt();
        int person = sc.nextInt();
        int top = sc.nextInt();
        int [] sums = new int[person];
        double [] para = new double[paraNum];
        for (int i = 0;i < paraNum;i++) {
            para[i] = sc.nextDouble();
        }
        for (int i = 0;i < person;i++) {
            double sum = 0.0;
            for (int j = 0;j < paraNum;j++) {
                sum += para[j]*sc.nextInt();
            }
            sums[i] = (int)Math.round(sum); 
        }
        Arrays.sort(sums);
        for (int i = 0;i < top;i++) {
            System.out.println(sums[sums.length-1-i]);
        }
        
    }
}