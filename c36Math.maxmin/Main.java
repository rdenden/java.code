import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entryNum1 = sc.nextInt();
        int entryNum2 = sc.nextInt();
        int entryNum3 = sc.nextInt();
        int entryNum4 = sc.nextInt();
        Map<Integer,Integer> times = new HashMap<>();
        for (int i = 0;i < 4;i++) {
            int time = sc.nextInt();
            times.put(i+1,time);
        }
        
        int winner1;
        int winner2;
        if (times.get(entryNum1) > times.get(entryNum2)) {
            winner1= entryNum2;
        } else {
            winner1 = entryNum1;
        }
        if (times.get(entryNum3) > times.get(entryNum4)) {
            winner2 = entryNum4;
        } else {
            winner2 = entryNum3;
        }
        int finalTime1 = sc.nextInt();
        int finalTime2 = sc.nextInt();
        int first;
        int second;
        if (finalTime1 < finalTime2) {
            first = Math.min(winner1,winner2);
            second = Math.max(winner1,winner2);
        } else {
            first = Math.max(winner1,winner2);
            second = Math.min(winner1,winner2);
        }
        System.out.println(first);
        System.out.println(second);
    }
}