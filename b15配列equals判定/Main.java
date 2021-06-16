import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] sample = {
                {"1","1","1","1","1","1","0"},
                {"0","1","1","0","0","0","0"},
                {"1","1","0","1","1","0","1"},
                {"1","1","1","1","0","0","1"},
                {"0","1","1","0","0","1","1"},
                {"1","0","1","1","0","1","1"},
                {"1","0","1","1","1","1","1"},
                {"1","1","1","0","0","1","0"},
                {"1","1","1","1","1","1","1"},
                {"1","1","1","1","0","1","1"}
                };
        
        String[] array1 = new String[7];
        String[] array2 = new String[7];
        for(int i = 0;i < 7;i ++) {
            String s = sc.next();
            array1[i] = s;
        }
        for(int i = 0;i < 7;i ++) {
            String s = sc.next();
            array2[i] = s;
        }
        int count = 0;
        for(int i = 0;i < 10;i ++) {
          // Arrays.equals(配列１,配列２) 配列１と配列２がイコールか判定
            if (Arrays.equals(array1,sample[i])) {
                count += 1;
            }
            if (Arrays.equals(array2,sample[i])) {
                count += 1;
            }
        }
        if (count == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String[] array11 = {array1[0],array1[5],array1[4],array1[3],array1[2],array1[1],array1[6]};
        String[] array22 = {array2[0],array2[5],array2[4],array2[3],array2[2],array2[1],array2[6]};
        count = 0;
        for(int i = 0;i < 10;i ++) {
            if (Arrays.equals(array11,sample[i])) {
                count += 1;
            }
            if (Arrays.equals(array22,sample[i])) {
                count += 1;
            }
        }
        if (count == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String[] array111 = {array1[3],array1[4],array1[5],array1[0],array1[1],array1[2],array1[6]};
        String[] array222 = {array2[3],array2[4],array2[5],array2[0],array2[1],array2[2],array2[6]};
        count = 0;
        for(int i = 0;i < 10;i ++) {
            if (Arrays.equals(array111,sample[i])) {
                count += 1;
            }
            if (Arrays.equals(array222,sample[i])) {
                count += 1;
            }
        }
        if (count == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}
