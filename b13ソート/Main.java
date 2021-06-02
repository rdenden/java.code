import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int trainNum = sc.nextInt();
        int paizaM = 59-c-b;
        int paizaH = 8;
        if (paizaM < 0) {
            paizaM += 60;
            paizaH = 7;
        }
        
        List<Train> trains = new ArrayList<>();
        Train t = new Train(paizaH,paizaM);
        for(int i = 0;i < trainNum;i++) {
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            trains.add(new Train(hour,minute));
        }
        // tは後から追加する。ソートして同時刻になった場合にtが後ろに来るようにする
        trains.add(t);
        Collections.sort(trains);
        int index = 0;
        for (int i = 0;i < trains.size();i++) {
            if (trains.get(i) == t) {
                index = i;
            }
        }
        Train rideTrain = trains.get(index - 1);
        int minute = rideTrain.minute - a;
        int hour = rideTrain.hour;
        if (minute < 0) {
            minute += 60;
            hour -= 1;
        }
        
        System.out.println(String.format("%02d",hour) + ":" + String.format("%02d",minute));
    }
    public static class Train implements Comparable<Train>{
        int hour;
        int minute;
        public Train(int hour,int minute) {
            this.hour = hour;
            this.minute = minute;
        }
        public String toString() {
            return hour + ":" + minute;
        }
        public int compareTo(Train o) {
          // hourで順序を決める
            if (this.hour < o.hour) {
                return -1;
            }
            if (this.hour > o.hour) {
                return 1;
            }
            // hourが同じときminuteで順序を決める
            if (this.minute < o.minute) {
                return -1;
            }
            if (this.minute > o.minute) {
                return 1;
            }
            return 0;
        }
    }
}