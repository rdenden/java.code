import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String result = line.replaceAll("[aioue]","");
        System.out.println(result);
    }
}