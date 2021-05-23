import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int foods = 0;
        int books = 0;
        int clothes = 0;
        int other = 0;
        int num = sc.nextInt();
        for (int i = 0;i < num;i++) {
            int itemNum = sc.nextInt();
            switch (itemNum) {
                case 0:
                    foods += sc.nextInt();
                    break;
                case 1:
                    books += sc.nextInt();
                    break;
                case 2:
                    clothes += sc.nextInt();
                    break;
                case 3:
                    other += sc.nextInt();
                    break;
            }
        }
        // 100で割ったあまりをそれ自身から引く→10の位切り捨て
        int foodsP = (foods-(foods%100))*5/100;
        int booksP = (books-(books%100))*3/100;
        int clothesP = (clothes-(clothes%100))*2/100;
        int otherP = (other-(other%100))*1/100;
        int result = foodsP+booksP+clothesP+otherP;
        System.out.println(result);
    }
}