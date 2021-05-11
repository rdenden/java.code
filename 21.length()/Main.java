
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        if (line1.length() == line2.length()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}