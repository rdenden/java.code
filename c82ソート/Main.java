import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int border = sc.nextInt();
        List<Score> scores = new ArrayList<>();
        for (int i = 0;i < student;i++) {
            int name = i + 1;
            int e = sc.nextInt();
            int j = sc.nextInt();
            int m = sc.nextInt();
            Score s = new Score(name,e,j,m);
            scores.add(s);
        }
        
        for (int i = 0;i < student;i++) {
            int count = 0;
            Collections.sort(scores,new EnglishComparator());
            for(int j = 0;j < scores.size();j++) {
                if (j >= border && scores.get(j).english != scores.get(j-1).english) {
                    break;
                }
                if (scores.get(j).name == i + 1) {
                    count += 1;
                    break;
                }
                
            }
            Collections.sort(scores,new JapaneseComparator());
            for(int j = 0;j < scores.size();j++) {
                if (j >= border && scores.get(j).japanese != scores.get(j-1).japanese) {
                    break;
                }
                if (scores.get(j).name == i + 1) {
                    count += 1;
                    break;
                }
                
            }
            Collections.sort(scores,new MathComparator());
            for(int j = 0;j < scores.size();j++) {
                if (j >= border && scores.get(j).math != scores.get(j-1).math) {
                    break;
                }
                if (scores.get(j).name == i + 1) {
                    count += 1;
                    break;
                }
            }
            System.out.println(count);
        }
    }
}

class Score {
    int english;
    int japanese;
    int math;
    int name;
    Score (int name,int english,int japanese,int math) {
        this.name = name;
        this.english = english;
        this.japanese = japanese;
        this.math = math;
    }
    public String toString() {
        return this.name + "-" + this.english + "-" + this.japanese + "-" + this.math;
    }
}
class EnglishComparator implements Comparator<Score> {
    public int compare(Score x,Score y) {
        return (x.english - y.english);
    }
}
class JapaneseComparator implements Comparator<Score> {
    public int compare(Score x,Score y) {
        return (x.japanese - y.japanese);
    }
}
class MathComparator implements Comparator<Score> {
    public int compare(Score x,Score y) {
        return (x.math - y.math);
    }
}
