import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String team = sc.next();
        int passer = sc.nextInt();
        
        List<Player> members = new ArrayList<>();
        Player p1 = null;
        Player p2 = null;
        
        for (int i = 0;i < 22;i++) {
            if (i < 11) {
                Player member = new Player(i+1,sc.nextInt(),"A");
                members.add(member);
            } else {
                Player member = new Player(i-10,sc.nextInt(),"B");
                members.add(member);
            }
            
        }
        if (team.equals("A")) {
            p1 = members.get(passer - 1);
        } else {
            p1 = members.get(passer - 1 + 11);
        }
        Collections.sort(members);
        
        int count = 0;
        switch (team) {
            case "A":
                for (int i = 0;i < 22;i++) {
                    if (members.get(21-i).team.equals("B")) {
                        if (count == 1) {
                            p2 = members.get(21-i);
                            
                            break;
                        } else {
                            count += 1;
                        }
                    }
                }
                break;
            case "B":
                for (int i = 0;i < 22;i++) {
                    if (members.get(i).team.equals("A")) {
                        if (count == 1) {
                            p2 = members.get(i);
                            
                            break;
                        } else {
                            count += 1;
                        }
                    }
                }
                break;
        }
        
        
        List<Integer> result = new ArrayList<>();
        switch (team) {
            case "A":
                for (Player v: members) {
                    if (v.position >= 55 && v.position > p1.position && 
                        v.position > p2.position && v.team.equals("A")) {
                        result.add(v.number);
                        
                    }
                }
                break;
            case "B":
                for (Player v: members) {
                    if (v.position <= 55 && v.position < p1.position && 
                        v.position < p2.position && v.team.equals("B")) {
                        result.add(v.number);
                        
                    }
                }
                break;
        }
        Collections.sort(result);
        
        for (int i = 0;i < result.size();i++) {
            System.out.println(result.get(i));
        }
        if (result.size() == 0) {
            System.out.println("None");
        }
        
    }
    public static class Player implements Comparable<Player>{
        int number;
        int position;
        String team;
        public Player(int number,int position,String team) {
            this.number = number;
            this.position = position;
            this.team = team;
        }
        public String toString(){
            return "{" + team + "-" + number + "," + position + "}";
        }
        public int compareTo(Player obj) {
            if (this.position < obj.position) {
                return -1;
            }
            if (this.position > obj.position) {
                return 1;
            }
            return 0;
        }
    }
}

