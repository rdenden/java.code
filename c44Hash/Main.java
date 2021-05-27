import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Set<String> jan = new HashSet<>();
        for (int i = 0;i < num;i++) {
            jan.add(sc.next());
        }
        String result;
        if (jan.size() == 1 || jan.size() == 3) {
            result = "draw";
        } else {
            if (!jan.contains("rock")) {
                result = "scissors";
            } else if (!jan.contains("paper")) {
                result = "rock";
            } else {
                result = "paper";
            }
        }
        System.out.println(result);
    }
}