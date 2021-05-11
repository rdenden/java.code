
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        // 末尾にaaaaaがあるか
        if (line.endsWith("aaaaa")) {
          // 0番目から、line.length()-5　番目の手前まで切り取る
            System.out.println(line.substring(0,line.length()-5));
        } else {
            System.out.println(line);
        }
        
    }
}