import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int [] array = {1,2,3,4,5,6};        
        System.out.println(Arrays.toString(array));
        // 多次元配列の場合
        int [][] countries = new int [3][5];
        System.out.println(Arrays.deepToString(countries));
    }
}
