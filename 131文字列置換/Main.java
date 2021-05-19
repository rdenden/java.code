import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        // 一気に置換できない
        line = line.replace("0","C");
        line = line.replace("1","A");
        line = line.replace("2","B");
        System.out.println(line);
    }
}