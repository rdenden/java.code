import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        String result;
        for (int i = 0;i < num;i++) {
            ArrayList<Integer> divisors = new ArrayList<>();
            int sum = 0;
            int number = sc.nextInt();
            for (int j = 1;j < number;j++) {
                if (number % j == 0) {
                    divisors.add(j); 
                }
            }
            for (int value: divisors) {
                sum += value;
                
            }
            
            if (sum == number) {
                result = "perfect";
            } else if (Math.abs(sum - number) == 1) {
                result = "nearly";
            } else {
                result = "neither";
            }
        System.out.println(result);    
        }
        
    }
}