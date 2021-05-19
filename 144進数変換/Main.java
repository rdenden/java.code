import java.util.*;
//    10進数30を16進数に変換
// 		String s_16 = Integer.toString(30,16);
		
// 		10進数100を7進数に変換
// 		int i_7 = Integer.parseInt(Integer.toString(100,7));

//    16進数1eを10進数に変換
//    int i1 = Integer.parseInt("1e",16);
		
//    7進数202を10進数に変換
//    int i2 = Integer.parseInt("202",7);

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int result = Integer.parseInt(line,2);
        System.out.println(result);
    }
}