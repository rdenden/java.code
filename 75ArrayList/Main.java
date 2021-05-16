import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            nums.add(sc.nextInt());
        }
        for (int i = 1; i <= 5; i++) {
            if (!(nums.contains(i))) {
                System.out.println(i);
            }
        }
    }
}