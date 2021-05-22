import java.util.*;


public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sugerBase = sc.nextInt();
        int dif = sc.nextInt();
        
        int massMax = 0;
        int result = 0;
        
        for (int i = 0;i < num;i++) {
            int mass = sc.nextInt();
            int suger = sc.nextInt();
            if (suger >= sugerBase-dif && suger <= sugerBase+dif) {
                if (massMax < mass) {
                    result = i+1;
                    massMax = mass;
                } 
            }
        }
        if (result == 0) {
            System.out.println("not found");
        } else {
            System.out.println(result);
        }
    }
}