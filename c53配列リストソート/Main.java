import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        List<Integer>scores = new ArrayList<>();
        for (int i = 0;i < num;i++) {
            String st = sc.next();
            if (!(st.equals("x10"))) {
                Integer score = Integer.parseInt(st);
                scores.add(score);
            }
        }
        // 0を含んでいるときは zero = true とする
        boolean zero;
        if (scores.contains(0)) {
            zero = true;
        } else {
            zero = false;
        }
        // リストを配列に変換
        Integer[] scoreArray = scores.toArray(new Integer[0]);
        // ソートして、0を含んでいるときは末尾を0に変える
        Arrays.sort(scoreArray);
        if (zero) {
            scoreArray[scoreArray.length - 1] = 0;
        }
        // 合計値を算出
        int sum = 0;
		    for (int i = 0; i < scoreArray.length;i++) {
			      sum += scoreArray[i];
		    }
        // x10を含んでいるときは要素が１少ないのでこれで判定
        if (scoreArray.length == num - 1) {
            sum *= 10;
        }
        System.out.println(sum);
        
    }
}