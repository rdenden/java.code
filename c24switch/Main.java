import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int variable1 = 0;
        int variable2 = 0;
        int num = sc.nextInt();
        for (int i = 0;i < num;i++) {
            String str = sc.next();
            // switchはbreakを入れ忘れないようにする
            switch (str) {
                case "SET":
                    int num1 = sc.nextInt();
                    switch (num1) {
                        case 1:
                            int num11 = sc.nextInt();
                            variable1 = num11;
                            break;
                        case 2:
                            int num12 = sc.nextInt();
                            variable2 = num12;
                            break;
                    }
                    break;
                case "ADD":
                    int num2 = sc.nextInt();
                    variable2 = num2 + variable1;
                    break;
                case "SUB":
                    int num3 = sc.nextInt();
                    variable2 = variable1 - num3;
                    break;
            }
        }
        System.out.println(variable1 + " " + variable2);
    }
}