import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int aMoney = sc.nextInt();
        int bMoney = sc.nextInt();
        char person;
        int result;
        while (true) {
            if (price + 10 > aMoney) {
                person = 'B';
                result = price;
                break;
            }
            price += 10;
            if (price + 1000 > bMoney) {
                person = 'A';
                result = price;
                break;
            }
            price += 1000;
        }
        
        System.out.println(person + " " + result);
    }
}