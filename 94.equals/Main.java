import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int cat = 0;
        int dog = 0;
        for (int i = 0;i < 3;i++) {
            if ( sc.next().equals("cat") ){
                cat += 1;
            } else { 
                dog += 1;
            }
        }
        if (dog < cat) {
            System.out.println("cat");
        } else {
            System.out.println("dog");
        }
    }
}