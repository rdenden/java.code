import java.util.*;


public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Integer [] bingo = new Integer[6];
        for (int i = 0;i < 6;i++) {
            bingo[i] = sc.nextInt();
        }
        int sheetNum = sc.nextInt();
        
        for (int j = 0;j < sheetNum;j++) {
            int count = 0;
            for (int i = 0;i < 6;i++) {
                int num = sc.nextInt();
            
                // 配列に含まれるか
                if (Arrays.asList(bingo).contains(num)) {
                    count += 1;
                }
            }
            System.out.println(count);
        }
            
    }
}