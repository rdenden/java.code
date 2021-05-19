import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line1 = line.replaceAll("[A-Z]", "");
        String result;
        int count = 0;
        for (int i = 0; i < 10;i++) {
            result = "";
            String s = String.valueOf(i);
            for (int j = 0; j < 3;j++) {
                result += s;
            }
            if (result.equals(line1)) {
                System.out.println("Yes");
                break;
            }
            count += 1;
        }
        
        if (count == 10) {
            System.out.println("No");
        }
        
    }
}