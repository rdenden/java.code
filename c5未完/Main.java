import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        

        
        for (int i = 0;i < num;i++) {
            String result = "True";
            String line = sc.next();
            // ３桁以内.の正規表現
            if (!(line.matches("[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}"))) {
                result = "False";
            } else {
                String [] nums = line.split("[.]");
                for (String v: nums) {
                    // 先頭が０を除外
                    if (v.matches("0[0-9]{1,2}")){
                        result = "False";
                        break;
                    }
                    // 255以上を除外
                    int num255 = Integer.valueOf(v);
                    if (num255 > 255) {
                        result = "False";
                        break;
                    }
                }
            }
            System.out.println(result);
        }
        
    }
}