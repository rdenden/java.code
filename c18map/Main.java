import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int needNum = sc.nextInt();
        // マップを二つ作る
        Map<String,Integer> recipe = new HashMap<>();
        Map<String,Integer> have = new HashMap<>();
        for (int i = 0;i < needNum;i++) {
            String rKey = sc.next();
            int rKeyNum = sc.nextInt();
            recipe.put(rKey,rKeyNum);
        }
        int haveNum = sc.nextInt();
        for (int i = 0;i < haveNum;i++) {
            String hKey = sc.next();
            int hKeyNum = sc.nextInt();
            have.put(hKey,hKeyNum);
        }
        
        int result = 10000;
        boolean zero = true;
        // マップに格納された情報を１つずつ取り出す
        for (String key : recipe.keySet()) {
            int value = recipe.get(key);
            if (have.containsKey(key)) {
                if (result > (have.get(key) / value)) {
                    result = have.get(key) / value;
                    zero = false;
                }
            } else {
                zero = true;
                break;
            }
        }
        
        
        if (zero == false) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
        
    }
}