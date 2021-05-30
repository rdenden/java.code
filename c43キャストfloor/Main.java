import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double coffeePrice = sc.nextInt();
        double percentage = sc.nextInt();
        int sum = (int)coffeePrice;
        while (coffeePrice > 0) {
            coffeePrice = Math.floor(coffeePrice - (coffeePrice * percentage / 100)) ;
            sum += coffeePrice;
        }
        System.out.println(sum);
    }
}