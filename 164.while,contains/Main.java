import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        int num = 1;
        while (num < 256 ) {
            num *= 2;
            nums.add(num);
        }
        if (nums.contains(number)) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
        
    }
}