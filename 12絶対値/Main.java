public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // Mathクラスのabsメソッドで絶対値を取得できる
        number = Math.abs(number);
        System.out.println(number);
    }
}