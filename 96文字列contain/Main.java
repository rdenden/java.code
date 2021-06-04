import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if (line.contains("I") || line.contains("i") || line.contains("l")) {
            System.out.println("caution");
        } else {
            System.out.println(line);
        }
    }
}